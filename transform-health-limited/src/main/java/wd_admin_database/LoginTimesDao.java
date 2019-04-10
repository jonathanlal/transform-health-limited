package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DBConnection;
import wd_admin_objects.ViewObject;

public class LoginTimesDao {

	public void recordLoginInDB(ViewObject v) {
  try(Connection conn= DBConnection.getConnection()){
			  
			  PreparedStatement	pst = conn.prepareStatement("insert into login_times (browser,os,ip,referrer,fullagent,date,user_id,j_session_id) values (?,?,?,?,?,?,?,?);");  
			   pst.setString(1, v.getBrowser());
			   pst.setString(2, v.getOs());
			   pst.setString(3, v.getIp());
			   pst.setString(4, v.getReferrer());
			   pst.setString(5, v.getFullagent());
			   pst.setString(6, v.getDate());
			   pst.setInt(7, v.getUser_id());
			   pst.setString(8, v.getSession_id());
				pst.executeUpdate();	
				
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
