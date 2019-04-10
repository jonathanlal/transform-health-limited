package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import wd_admin_models.Articles;
import wd_admin_models.Leads;
import wd_admin_objects.ViewObject;


public class ViewsDao {

	public ViewObject getAllViewInfoByIDInDB(int viewid) {
		ViewObject view = new ViewObject();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select * from views where id=?;"); 
	  	pst.setInt(1, viewid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					view.setId(rs.getInt(1));
					view.setBrowser(rs.getString(2));
					view.setOs(rs.getString(3));
					view.setIp(rs.getString(4));
					view.setReferrer(rs.getString(5));
					view.setFullagent(rs.getString(6));
					view.setDate(rs.getString(7));
					view.setUrl(rs.getString(8));
					view.setDevice(rs.getString(9));
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return view;
	}


	public void restoreViewByIDInDB(int viewid) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update views set hide=null where id=?;");  
			  pst.setInt(1, viewid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public void deleteViewByID(int id) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update views set hide='yes' where id=?;");  
			  pst.setInt(1, id);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public int getViewCountByArticleInDB(int articleid) {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
			 PreparedStatement pst = conn.prepareStatement("select count(*) from views where articleid = ? and hide is null;"); 
			 pst.setInt(1, articleid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return size;
	}

	public List<ViewObject> getAllViewsByArticleIDInDB(int aid) {
			 ArrayList<ViewObject> views = new ArrayList<ViewObject>();
			 try(Connection conn= DBConnection.getConnection()){
		 PreparedStatement pst = conn.prepareStatement("select * from views where articleid=? and hide is null;");
		 	pst.setInt(1, aid);
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						ViewObject view = new ViewObject();
						view.setId(rs.getInt(1));
						view.setBrowser(rs.getString(2));
						view.setOs(rs.getString(3));
						view.setIp(rs.getString(4));
						view.setReferrer(rs.getString(5));
						view.setFullagent(rs.getString(6));
						view.setDate(rs.getString(7));
						view.setUrl(rs.getString(8));
						view.setDevice(rs.getString(9));
						views.add(view);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return views;
		}


	public int getViewsSizeInDB() {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select count(*) from views;"); 
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					size = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return size;
	}

	
	
	public void newViewInDB(ViewObject v) {
		  try(Connection conn= DBConnection.getConnection()){
					  
					  PreparedStatement	pst = conn.prepareStatement("insert into views (browser,os,ip,referrer,fullagent,date,url,device,j_session_id,user_id) values (?,?,?,?,?,?,?,?,?,?);");  
					   pst.setString(1, v.getBrowser());
					   pst.setString(2, v.getOs());
					   pst.setString(3, v.getIp());
					   pst.setString(4, v.getReferrer());
					   pst.setString(5, v.getFullagent());
					   pst.setString(6, v.getDate());
					   pst.setString(7, v.getUrl());
					   pst.setString(8, v.getDevice());
					   pst.setString(9, v.getSession_id());
					   pst.setInt(10, v.getUser_id());
						pst.executeUpdate();	
						
				  }catch (SQLException e) {
						e.printStackTrace();
					}
			}


	public int getViewIDBySessionIDAndURLInDB(String jSessionID, String url) {
		int view_id = 0;
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select id from views where url = ? and j_session_id = ? order by id desc limit 1;"); 
	 pst.setString(1, url);
	 pst.setString(2, jSessionID);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					view_id = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return view_id;
	}

}
