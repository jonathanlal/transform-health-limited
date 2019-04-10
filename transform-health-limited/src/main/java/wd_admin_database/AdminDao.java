package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import wd_admin_objects.DashboardObject;
import wd_admin_objects.UserObject;

public class AdminDao {

	public List<UserObject> getAllUsersInDB() {
		 ArrayList<UserObject> users = new ArrayList<UserObject>();
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select user_name,user_email,account_type from user;"); 
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					
					UserObject user = new UserObject();
					user.setUser_name(rs.getString(1));
					user.setUser_email(rs.getString(2));
					user.setAccount_type(rs.getString(3));
					
					users.add(user);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return users;
	}

	
	
	
	

}
