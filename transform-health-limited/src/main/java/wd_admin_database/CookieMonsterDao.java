package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBConnection;
import wd_admin_objects.UserObject;

public class CookieMonsterDao {

	public void setCookieInDB(int userid, String cookie) {
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("update user set cookie=? where id=?;");  
			  pst.setString(1, cookie);
			  pst.setInt(2, userid);
				pst.executeUpdate();	
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public String getCookieInDB(int userid) {
		String cookie = null;
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("select cookie from user where id=?;");
			  pst.setInt(1, userid);
			   ResultSet rst = pst.executeQuery();	
				  while (rst.next()) {
					  cookie = rst.getString(1);
				  }
		  }catch (SQLException e) {
				e.printStackTrace();
			}
		  return cookie;		
	}

	public UserObject getUserInfoByCookieInDB(String cookie) {
		UserObject user = new UserObject();
		try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("select id,user_name,user_email,account_type from user where cookie=?;");
			  pst.setString(1, cookie);
			   ResultSet rst = pst.executeQuery();	
				  while (rst.next()) {
					  
					  int userid = rst.getInt(1);
					  user.setUser_id(userid);
					  String username = rst.getString(2);
					  user.setUser_name(username);
					  String email = rst.getString(3);
					  user.setUser_email(email);
					  String accountType = rst.getString(4);
					  user.setAccount_type(accountType);
				  }
		  }catch (SQLException e) {
				e.printStackTrace();
			}
		  return user;	
	}

	
	

}
