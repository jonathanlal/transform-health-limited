package wd_admin_database;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import wd_admin_models.GetDate;
import wd_admin_models.ImageUrl;
import wd_admin_models.Leads;
import wd_admin_models.Views;
import wd_admin_objects.ArticleObject;


public class ArticlesDao {
	public List<ArticleObject> getArticlesInDB() {
		 ArrayList<ArticleObject> articles = new ArrayList<ArticleObject>();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select id,title,hide from articles where deleted is null;"); 
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					ArticleObject article = new ArticleObject();
					article.setId(rs.getInt(1));
					article.setTitle(rs.getString(2));
					String hide = rs.getString(3);
					if(hide == null){
						hide = "danger";
					}else{
						//article is public so green
						hide = "success";
					}
					article.setHide(hide);
					articles.add(article);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return articles;
	}

	public int newArticleInDB(String title, String date, int uid,String author,String authorimage) {
		int aid = 0;
		  try(Connection conn= DBConnection.getConnection()){
					  PreparedStatement	pst = conn.prepareStatement("insert into articles (title,date,userid,author,authorimage,sharetitle) values (?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);  
					   pst.setString(1, title);
					   pst.setString(2, date);
					   pst.setInt(3, uid);
					   pst.setString(4, author);
					   pst.setString(5, authorimage);
					   pst.setString(6, title);
					   pst.executeUpdate();	
						ResultSet rs = pst.getGeneratedKeys();
						while (rs.next()) {
							aid = rs.getInt(1);
						}
				  }catch (SQLException e) {
						e.printStackTrace();
					}
		  return aid;
	}
	//admin
	public ArticleObject getAllArticleInfoByID(int aid) throws UnsupportedEncodingException, ParseException {
		ArticleObject article = new ArticleObject();
		ImageUrl i = new ImageUrl();
		Views v = new Views();
		Leads l = new Leads();
		GetDate gd = new GetDate();
		try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select * from articles where id=?;"); 
	 			pst.setInt(1, aid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					article.setId(aid);
					String title = rs.getString(2).trim();
					article.setTitle(title);
					
					String url = rs.getString(3);
					if(url == null){
						url = createArticleUrl(title,aid);
					}
					article.setUrl(url);
					article.setBody(rs.getString(4));
					article.setAuthor(rs.getString(5));
					String date = rs.getString(6);
					article.setDate(gd.getFormattedDate(date));
					article.setHide(rs.getString(7));
					article.setCampaignid(rs.getInt(8));
					String shareimage = rs.getString(9);
					if(shareimage != null){
					shareimage = i.getURL(shareimage, 325);
					}else{
						shareimage = "https://storage.googleapis.com/laliberte-center.appspot.com/logo-share-image.png";
					}
					article.setShareimage(shareimage);
					article.setSharetext(rs.getString(10));
					article.setSharetitle(rs.getString(11)); 
					article.setDeleted(rs.getString(12)); 
					String contact = rs.getString(13);
					if(contact == null){
						contact = ""; //otherwise we get nullpointer exception when toggling
					}
					article.setContact(contact);
					String headerimage = rs.getString(14);
					if(headerimage == null){
						headerimage = "../../../img/landing.jpg";
					}
					article.setHeaderimage(headerimage);

					int userid = rs.getInt(15);
					article.setUserid(userid);
					
					String authorimage = rs.getString(16);
					article.setAuthorimage(authorimage);
					
					String language = rs.getString(17);
					if(language == null){
						language = "text_en";
					}
					article.setLanguage(language);
					
					int views = v.getViewCountByArticle(aid);
					article.setViews(views);
					
					int leads = l.getLeadsCountByArticleID(aid);
					article.setLeads(leads);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return article;
	}
	public String createArticleUrl(String sometext, int aid) throws UnsupportedEncodingException{
		String url = createArticleUrlFromText(sometext);
		boolean urlExists = checkIfUrlExists(url, aid);
		if(urlExists){
			int count = getNumberOfTimesURLAppearsInDB(url);	//get count and add to end of url
			return url+"-"+count;
		}else{
			return url;
		}
	}
	private int getNumberOfTimesURLAppearsInDB(String url) {
		int count = 0;
		  try(Connection conn= DBConnection.getConnection()){
					  PreparedStatement	pst = conn.prepareStatement("select count(*) from articles where url=? and deleted is null;");  
					   pst.setString(1, url);
						ResultSet rs = pst.executeQuery();
						while (rs.next()) {
							count = rs.getInt(1);
						}
				  }catch (SQLException e) {
						e.printStackTrace();
					}
		  return count+1;
	}

	public boolean checkIfUrlExists(String url, int aid){
		boolean exists = false;
		  try(Connection conn= DBConnection.getConnection()){
					  PreparedStatement	pst = conn.prepareStatement("select id from articles where url=?;");  
					   pst.setString(1, url);
						ResultSet rs = pst.executeQuery();
						while (rs.next()) {
							//if article id is not equal to the current article id, then you cannot use this url bitch
							if(aid != rs.getInt(1)){
								exists = true;
							}
						}
				  }catch (SQLException e) {
						e.printStackTrace();
					}
		  return exists;
	}
	public String createArticleUrlFromText(String title) throws UnsupportedEncodingException{
		return URLEncoder.encode(title.replace(" ", "-"), "UTF-8");
	}
	

	public void changeArticleTitleInDB(String title, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set title=? where id=?;");  
			  pst.setString(1, title);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleBodyInDB(String body, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set body=? where id=?;");  
			  pst.setString(1, body);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleHideInDB(String status, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set hide=? where id=?;");  
			  pst.setString(1, status);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleUrlInDB(String url, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set url=? where id=?;");  
			  pst.setString(1, url);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleAuthor(String author, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set author=? where id=?;");  
			  pst.setString(1, author);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleCampaign(int cid, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set campaignid=? where id=?;");  
			  pst.setInt(1, cid);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}		
	}
	public void changeArticleContact(String status, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set contact=? where id=?;");  
			  pst.setString(1, status);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleShareTitle(String title, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set sharetitle=? where id=?;");  
			  pst.setString(1, title);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleShareDescription(String description, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set sharetext=? where id=?;");  
			  pst.setString(1, description);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public void changeArticleShareImage(String url, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set shareimage=? where id=?;");  
			  pst.setString(1, url);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public void deleteArticle(String deleted, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set deleted=? where id=?;");  
			  pst.setString(1, deleted);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public ArticleObject getAllArticleInfoByUrl(String url) throws UnsupportedEncodingException, ParseException {
		ArticleObject article = new ArticleObject();
		ImageUrl i = new ImageUrl();
		GetDate gd = new GetDate();
		ImageUrl imgUrl = new ImageUrl();
		try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select * from articles where url=?;"); 
	 			pst.setString(1, url);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					article.setId(rs.getInt(1));
					String title = rs.getString(2).trim();
					article.setTitle(title);
					
//					String url = rs.getString(3);
//					if(url == null){
//						url = createArticleUrl(title,aid);
//					}
					article.setShare(getShareButtons("https://www.thelalibertecenter.com/article/"+url));
					article.setUrl(url);
					
					String body = rs.getString(4);
					if(body != null){
					body = URLDecoder.decode(body, "UTF-8");
					}
					article.setBody(body);
					
					int readtime = 0;
					if(body != null && !body.isEmpty()){
					readtime = calculateReadTime(body);
					}
					
					article.setReadtime(readtime);
					
					article.setAuthor(rs.getString(5));
					String date = rs.getString(6);
					article.setDate(gd.getFormattedDate(date));
					article.setHide(rs.getString(7));
					article.setCampaignid(rs.getInt(8));
					String shareimage = rs.getString(9);
					if(shareimage != null){
					shareimage = i.getURL(shareimage, 325);
					}else{
						shareimage = "https://storage.googleapis.com/laliberte-center.appspot.com/logo-share-image.png";
					}
					article.setShareimage(shareimage);
					article.setSharetext(rs.getString(10));
					article.setSharetitle(rs.getString(11)); 
					article.setDeleted(rs.getString(12)); 
					String contact = rs.getString(13);
					if(contact == null){
						contact = ""; //otherwise we get nullpointer exception when toggling
					}
					article.setContact(contact);
					String headerimage = rs.getString(14);
					if(headerimage == null){
						headerimage = "../../../img/landing.jpg";
					}
					article.setHeaderimage(headerimage);
					
					int userid = rs.getInt(15);
					article.setUserid(userid);
					
					String authorimage = rs.getString(16);
					if(authorimage == null || authorimage.isEmpty()){
						authorimage = "https://www.w3schools.com/howto/img_avatar2.png";
					}
					authorimage = imgUrl.getURL(authorimage, 50);
					article.setAuthorimage(authorimage);
					
					String language = rs.getString(17);
					if(language == null){
						language = "text_en";
					}
					article.setLanguage(language);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return article;
	}
	public String getShareButtons(String url){
		String htmlMessage = "";

			htmlMessage += "<a href=\"http://twitter.com/share?url="+url+"\"  target=\"_blank\" class=\"share-btn twitter\">";
			htmlMessage += "<i class=\"icon-twitter\"></i>";
			htmlMessage += "</a>";
			
			htmlMessage += "<a href=\"https://plus.google.com/share?url="+url+"\" target=\"_blank\" class=\"share-btn google-plus\">";
			htmlMessage += "<i class=\"icon-gplus\"></i>";
			htmlMessage += "</a>";			
			
			htmlMessage += "<a href=\"http://www.facebook.com/sharer/sharer.php?u="+url+"\" target=\"_blank\" class=\"share-btn facebook\">";
			htmlMessage += "<i class=\"icon-facebook\"></i>";
			htmlMessage += "</a>";
			
			htmlMessage += "<a href=\"http://reddit.com/submit?url="+url+"\" target=\"_blank\" class=\"share-btn reddit\">";
			htmlMessage += "<i class=\"icon-reddit-alien\"></i>";
			htmlMessage += "</a>";
			
			htmlMessage += "<a href=\"http://www.linkedin.com/shareArticle?url="+url+"\" target=\"_blank\" class=\"share-btn linkedin\">";
			htmlMessage += "<i class=\"icon-linkedin\"></i>";
			htmlMessage += "</a>";
			
			htmlMessage += "<a href=\"mailto:?body="+url+"\" target=\"_blank\" class=\"share-btn email\">";
			htmlMessage += "<i class=\"icon-mail\"></i>";
			htmlMessage += "</a>";
			
			htmlMessage += "<a href=\"http://www.stumbleupon.com/submit?url="+url+"\" target=\"_blank\" class=\"share-btn stumbleupon\">";
			htmlMessage += "<i class=\"icon-stumbleupon\"></i>";
			htmlMessage += "</a>";
			
		return htmlMessage;
	}
	public static int calculateReadTime(String s){

		//average person reads about 200wpm
		
		//so number of words/200wpm
		
	    int wordCount = 0;

	    boolean word = false;
	    int endOfLine = s.length();
	    if(endOfLine > 0){
	    	endOfLine = - 1;
	    }

	    for (int i = 0; i < s.length(); i++) {
	        // if the char is a letter, word = true.
	        if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
	            word = true;
	            // if char isn't a letter and there have been letters before,
	            // counter goes up.
	        } else if (!Character.isLetter(s.charAt(i)) && word) {
	            wordCount++;
	            word = false;
	            // last word of String; if it doesn't end with a non letter, it
	            // wouldn't count without this.
	        } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
	            wordCount++;
	        }
	    }
	    return wordCount/200;
	}

	public void changeArticleHeaderImage(String image, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set headerimage=? where id=?;");  
			  pst.setString(1, image);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public int getArticlesSizeInDB() {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select count(*) from articles where deleted is null;"); 
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return size;
	}

	public List<ArticleObject> getArticlesByCampaignIDInDB(int campaignid) {
		Views v = new Views();
		Leads l = new Leads();
		ArrayList<ArticleObject> articles = new ArrayList<ArticleObject>();
		try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select id,title from articles where campaignid=? and deleted is null;"); 
	 			pst.setInt(1, campaignid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					ArticleObject article = new ArticleObject();
					int articleid = rs.getInt(1);
					article.setId(articleid);
					
					String title = rs.getString(2);
					article.setTitle(title);
					
					int views = v.getViewCountByArticle(articleid);
					article.setViews(views);
					
					int leads = l.getLeadsCountByArticleID(articleid);
					article.setLeads(leads);
					
					articles.add(article);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return articles;
	}

	public String getArticleTitleByIDInDB(int articleid) {
		String title = null;
		try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select title from articles where id=?;"); 
		pst.setInt(1, articleid);			
	 ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					title = rs.getString(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return title;
	}

	public void removeArticleFromCampaignInDB(int campaignid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set campaignid=null where campaignid=?;");  
			  pst.setInt(1, campaignid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleAuthorImageInDB(String image, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set authorimage=? where id=?;");  
			  pst.setString(1, image);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void changeArticleLanguageInDB(String language, int aid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update articles set language=? where id=?;");  
			  pst.setString(1, language);
			  pst.setInt(2, aid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
