package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DBConnection;
import wd_admin_models.GetDate;
import wd_admin_objects.UserObject;


public class UserDao {

		
	public String getPass(String user_email){
		String pass = null;
		PreparedStatement pst = null;
		  try(Connection conn= DBConnection.getConnection()){
				  pst = conn.prepareStatement("select user_pass from user where user_email=?;");  
			  pst.setString(1, user_email);  
			   ResultSet rst = pst.executeQuery();	
				  while (rst.next()) {
					  pass = rst.getString(1);
				  }
		  }catch (SQLException e) {
				e.printStackTrace();
			}
		  return pass;		
	}
		
	public int newuserInDB(String user_name, String user_password, String user_email, String user_type) {
		int userid = 0;
	  try(Connection conn= DBConnection.getConnection()){
		  PreparedStatement	pst = conn.prepareStatement("insert into user (user_name,user_pass,user_email,account_type, date) values (?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);  
		  pst.setString(1, user_name);
		  pst.setString(2, user_password);
		  pst.setString(3, user_email);
		  pst.setString(4, user_type);
		  pst.setString(5, GetDate.now());
			pst.executeUpdate();	
			ResultSet rs = pst.getGeneratedKeys();
			while (rs.next()) {
				userid = rs.getInt(1);
			}
	  }catch (SQLException e) {
			e.printStackTrace();
		}
	return userid;
	}


//	public int registerNewUserInDB(UserObject data) {
//		int userid = 0;
//	  try(Connection conn= DBConnection.getConnection()){
//		  PreparedStatement	pst = conn.prepareStatement("insert into user (user_name,user_pass,user_email,account_type) values (?,?,?,?);", Statement.RETURN_GENERATED_KEYS);  
//		  pst.setString(1, data.getuser_name());
//		  pst.setString(2, data.getPassword());
//		  pst.setString(3, data.getEmail());
//		  pst.setString(4, data.getAccounttype());
//	
//			pst.executeUpdate();	
//			ResultSet rs = pst.getGeneratedKeys();
//			while (rs.next()) {
//				userid = rs.getInt(1);
//			}
//	  }catch (SQLException e) {
//			e.printStackTrace();
//		}
//	return userid;
//	}



	public boolean emailAlreadyExistsInDB(String email) {
		boolean check = false;
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("select * from user where user_email = ?;"); 
			  pst.setString(1, email);
			   ResultSet rst = pst.executeQuery();	
			   check = rst.next();
		  }catch (SQLException e) {
				e.printStackTrace();
			}
		  return check;	
	}

	public UserObject getSessionVariablesByEmailInDB(String user_email) {
		UserObject u = new UserObject();
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("select id, user_name, account_type from user where user_email= ?;");  
			  pst.setString(1, user_email);
			  ResultSet rs = pst.executeQuery();	
				while (rs.next()) {
					u.setUser_id(rs.getInt(1));
					u.setUser_name(rs.getString(2));
					u.setAccount_type(rs.getString(3));
					u.setUser_email(user_email);
				}
		  }catch (SQLException e) {
				e.printStackTrace();
			}
		return u;
	}

	public int getUsersSize() {
		int size = 0;
		 try(Connection conn= DBConnection.getConnection()){
	 PreparedStatement pst = conn.prepareStatement("select count(*) from user;"); 
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
