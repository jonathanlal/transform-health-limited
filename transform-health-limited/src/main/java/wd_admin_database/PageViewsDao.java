package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DBConnection;
import wd_admin_models.GetDate;
import wd_admin_objects.ViewObject;


public class PageViewsDao {

	public int getPageCountByUrl(String url) {
		int count = 0;
		 try(Connection conn= DBConnection.getConnection()){
				 PreparedStatement pst = conn.prepareStatement("select viewcount from page_views where url=?;"); 
				  pst.setString(1, url);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					count = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return count;
	}

	public void updatePageCountByURL(String url, int count) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update page_views set viewcount=? where url=?;");  
			  pst.setInt(1, count);
			  pst.setString(2, url);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public boolean checkIfPageExistsInDB(String url) {
		boolean exists = false;
		 try(Connection conn= DBConnection.getConnection()){
				 PreparedStatement pst = conn.prepareStatement("select * from page_views where url=?;"); 
				  pst.setString(1, url);
				ResultSet rs = pst.executeQuery();
				exists = rs.next();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return exists;
	}

	public void newPage(String url) {
	  try(Connection conn= DBConnection.getConnection()){
		  String date = GetDate.now();
		  PreparedStatement	pst = conn.prepareStatement("insert into page_views (url,date,viewcount) values (?,?,?);");  
		  pst.setString(1, url);
		  pst.setString(2, date);
		  pst.setInt(3, 0);
			pst.executeUpdate();	
	  }catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getTotalViewsInDB() {
		int count = 0;
		 try(Connection conn= DBConnection.getConnection()){
				 PreparedStatement pst = conn.prepareStatement("select count(*) from views where hide is null;"); 
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					count += rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return count;
	}
	
	public int recordSingleViewInfo(ViewObject info) {
		int viewid = 0;
		  try(Connection conn= DBConnection.getConnection()){
					  PreparedStatement	pst = conn.prepareStatement("insert into views (browser,os,ip,referrer,fullagent,date,url,device,campaignid,landingid,articleid) values (?,?,?,?,?,?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);  
					   pst.setString(1, info.getBrowser());
					   pst.setString(2, info.getOs());
					   pst.setString(3, info.getIp());
					   pst.setString(4, info.getReferrer());
					   pst.setString(5, info.getFullagent());
					   pst.setString(6, info.getDate());
					   pst.setString(7, info.getUrl());
					   pst.setString(8, info.getDevice());
//					   pst.setInt(9, info.getCampaignid());
//					   pst.setInt(10, info.getLandingid());
//					   pst.setInt(11, info.getArticleid());
						pst.executeUpdate();	
						ResultSet rs = pst.getGeneratedKeys();
						while (rs.next()) {
							viewid = rs.getInt(1);
						}
				  }catch (SQLException e) {
						e.printStackTrace();
					}
		  return viewid;
	}


//	public int getPageCountByUrl(String url) {
//		  try(Connection conn= DBConnection.getConnection()){
//			  PreparedStatement	pst = conn.prepareStatement("update page_views set viewcount=? where url=?;");  
//			  pst.setInt(1, count);
//			  pst.setString(2, url);
//				pst.executeUpdate();	
//		  }catch (SQLException e) {
//				e.printStackTrace();
//			}
//	}

//	public int getPageIdByUrlInDB(String url) {
//	int pageid = 0;
//	 try(Connection conn= DBConnection.getConnection()){
// PreparedStatement pst = conn.prepareStatement("select id from page_views where url=?;"); 
//  pst.setString(1, url);
//			ResultSet rs = pst.executeQuery();
//			while (rs.next()) {
//				pageid = rs.getInt(1);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return pageid;
//}
	
}
