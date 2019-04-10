package wd_admin_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBConnection;
import wd_admin_models.GetDate;

public class SecretCodesDao {
	
	
	
	public void newCodeInDB(String code, String key) {
		try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("insert into secret_codes (code,secret_key,date) values (?,?,?);");  
			   pst.setString(1, code);
			   pst.setString(2, key);
			   pst.setString(3, GetDate.now());
				pst.executeUpdate();	
	  }catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getKeyByCodeInDB(String code) {
		String key = null;
		  try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("select secret_key from secret_codes where code = ?;"); 
			  pst.setString(1, code);
			   ResultSet rst = pst.executeQuery();	
			   while(rst.next()){
				key = rst.getString(1);
			   }
		  }catch (SQLException e) {
				e.printStackTrace();
			}
		  return key;	
	}

	public void deleteCodeInDB(String code) {
		try(Connection conn= DBConnection.getConnection()){
			  PreparedStatement	pst = conn.prepareStatement("delete from secret_codes where code = ?;");  
			   pst.setString(1, code);
				pst.executeUpdate();	
	  }catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
