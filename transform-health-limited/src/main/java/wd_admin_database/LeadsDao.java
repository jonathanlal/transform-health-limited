package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import wd_admin_models.GetDate;
import wd_admin_objects.LeadObject;


public class LeadsDao {

	public List<LeadObject> getAllLeadsInDB() {
		 ArrayList<LeadObject> leads = new ArrayList<LeadObject>();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select * from leads where hide is null order by id desc;"); 
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					LeadObject lead = new LeadObject();
					lead.setId(rs.getInt(1));
					lead.setName(rs.getString(2));
					lead.setEmail(rs.getString(3));
					lead.setPhone(rs.getString(4));
					String message = rs.getString(5);
					if(message.length()>=250){
						message = message.substring(0,250)+"...";
					}
					lead.setMessage(message);
					lead.setSource(rs.getString(6));
					lead.setCampaign(rs.getString(7));
					lead.setLanguage(rs.getString(8));
					lead.setDate(rs.getString(9));
					lead.setStatus(rs.getString(10));
					lead.setIsorganic(rs.getInt(11));
//					lead.setHide(rs.getInt(12));
					lead.setViewid(rs.getInt(13));
					leads.add(lead);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return leads;
	}

	public void deleteLeadInDB(int leadid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update leads set hide='yes' where id=?;");  
			  pst.setInt(1, leadid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}		
	}

	public void changeLeadStatusInDB(int leadid, String status) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update leads set status=? where id=?;");  
			  pst.setString(1, status);
			  pst.setInt(2, leadid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public void newLeadInDB(String name, String email, String phone, String message, String date, String status, int viewid) {
	  try(Connection conn= DBConnection.getConnection()){
		  PreparedStatement	pst = conn.prepareStatement("insert into leads (name,email,phone,message,date,status,viewid) values (?,?,?,?,?,?,?);");  
		  pst.setString(1, name);
		  pst.setString(2, email);
		  pst.setString(3, phone);
		  pst.setString(4, message);
		  pst.setString(5, date);
		  pst.setString(6, status);
		  pst.setInt(7, viewid);
			pst.executeUpdate();	
	  }catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getLeadsSizeInDB() {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select count(*) from leads where hide is null;"); 
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return size;
	}

	public int getLeadsCountByCampaign(int campaignid) {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
			 PreparedStatement pst = conn.prepareStatement("select count(*) from leads where campaignid = ? and hide is null;"); 
			 pst.setInt(1, campaignid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return size;
	}

	public List<LeadObject> getAllCampaignLeads(int campaignid) {
		 ArrayList<LeadObject> leads = new ArrayList<LeadObject>();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select id,name,message,date from leads where campaignid=? and hide is null;");
	 	pst.setInt(1, campaignid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					LeadObject lead = new LeadObject();
					lead.setId(rs.getInt(1));
					lead.setName(rs.getString(2));
					String message = rs.getString(3);
					if(message.length()>=250){
						message = message.substring(0,250)+"...";
					}
					lead.setMessage(message);
					lead.setDate(rs.getString(4));
					leads.add(lead);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return leads;
	}

	public LeadObject getAllLeadInfoByIDInDB(int leadid) {
		LeadObject lead = new LeadObject();
//		Campaigns c = new Campaigns();
//		Landing l = new Landing();
//		Articles a = new Articles();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select * from leads where id=?;"); 
	  	pst.setInt(1, leadid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					lead.setId(rs.getInt(1));
					lead.setName(rs.getString(2));
					lead.setEmail(rs.getString(3));
					lead.setPhone(rs.getString(4));
					lead.setMessage(rs.getString(5));
					lead.setSource(rs.getString(6));
					lead.setLanguage(rs.getString(7));
					lead.setDate(rs.getString(8));
					lead.setStatus(rs.getString(9));
					lead.setHide(rs.getString(10));
//					lead.setViewid(rs.getInt(11));
//					int campaignid = rs.getInt(12);
//					System.out.println(campaignid);
//					lead.setCampaignid(campaignid);
//					String campaignname = c.getCampaignNameByID(campaignid);
//					System.out.println(campaignname);
//					lead.setCampaignname(campaignname);
					
//					int landingid = rs.getInt(13);
//					String landingdescription = l.getLandingDescriptionByID(landingid);
					
//					lead.setLandingid(landingid);
//					lead.setLandingdescription(landingdescription);
					
//					int articleid = rs.getInt(14);
//					String articletitle = a.getArtitleTitleByID(articleid);
					
//					lead.setArticleid(articleid);
//					lead.setArticletitle(articletitle);
					
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lead;
	}

	public int getLeadsCountByLandingIDInDB(int landingid) {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select count(*) from leads where landingid=? and hide is null;"); 
	  	pst.setInt(1, landingid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return size;
	}

	public List<LeadObject> getAllLeadsByLandingIDInDB(int landingid) {
		 ArrayList<LeadObject> leads = new ArrayList<LeadObject>();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select id,name,message,date from leads where landingid=? and hide is null;");
	 	pst.setInt(1, landingid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					LeadObject lead = new LeadObject();
					lead.setId(rs.getInt(1));
					lead.setName(rs.getString(2));
					String message = rs.getString(3);
					if(message.length()>=250){
						message = message.substring(0,250)+"...";
					}
					lead.setMessage(message);
					lead.setDate(rs.getString(4));
					leads.add(lead);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return leads;
	}
	public List<LeadObject> getAllLeadsByArticleIDInDB(int aid) {
		 ArrayList<LeadObject> leads = new ArrayList<LeadObject>();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select id,name,message,date from leads where articleid=? and hide is null;");
	 	pst.setInt(1, aid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					LeadObject lead = new LeadObject();
					lead.setId(rs.getInt(1));
					lead.setName(rs.getString(2));
					String message = rs.getString(3);
					if(message.length()>=250){
						message = message.substring(0,250)+"...";
					}
					lead.setMessage(message);
					lead.setDate(rs.getString(4));
					leads.add(lead);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return leads;
	}

	public int getLeadsCountByLanding(int landing) {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
			 PreparedStatement pst = conn.prepareStatement("select count(*) from leads where landingid = ? and hide is null;"); 
			 pst.setInt(1, landing);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return size;
	}

	public int leadIDByViewIDInDB(int viewid) {
		int leadid = 0;
		 try(Connection conn= DBConnection.getConnection()){
			 PreparedStatement pst = conn.prepareStatement("select id from leads where viewid = ?;"); 
			 pst.setInt(1, viewid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					leadid = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return leadid;
	}

	public void deleteLeadByCampaign(int id) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update leads set hide='yes' where campaignid=?;");  
			  pst.setInt(1, id);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public void deleteLeadByLanding(int landingid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update leads set hide='yes' where landingid=?;");  
			  pst.setInt(1, landingid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public void restoreLeadsByCampaignIDInDB(int campaignid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update leads set hide=null where campaignid=?;");  
			  pst.setInt(1, campaignid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public void restoreLeadsByLandingIDInDB(int id) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update leads set hide=null where landingid=?;");  
			  pst.setInt(1, id);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public void restoreLeadByID(int id) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update leads set hide=null where id=?;");  
			  pst.setInt(1, id);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public int getViewIDByLeadID(int id) {
		int viewid = 0;
		 try(Connection conn= DBConnection.getConnection()){
			 PreparedStatement pst = conn.prepareStatement("select viewid from leads where id = ?;"); 
			 pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					viewid = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return viewid;
	}

	public int getLeadsCountByArticleIDInDB(int landingid) {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select count(*) from leads where articleid=? and hide is null;"); 
	  	pst.setInt(1, landingid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return size;
	}

	
}
