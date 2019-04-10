package database;

import java.sql.Connection;
import java.sql.DriverManager;

import com.google.appengine.api.utils.SystemProperty;

public class DBConnection {
	private static String url = null;
	private static Connection conn = null;
	 public static Connection getConnection(){
	 try{
		 System.out.println("VALUE: "+SystemProperty.environment.value());
	 if (SystemProperty.environment.value() ==
	     SystemProperty.Environment.Value.Production) {
	   Class.forName("com.mysql.jdbc.GoogleDriver");
	   url = "jdbc:google:mysql://client-cms-1008:europe-west1:client-cms-instance/transform_health_limited"; 
	 } else {
	   Class.forName("com.mysql.jdbc.Driver"); //don't need to specify this
	   url = "jdbc:mysql://localhost:3306/transform-health-limited";
	 }
	 conn = DriverManager.getConnection(url,"root","1234");
	 }	 catch (Exception e) {
			System.out.println(e);
		} 
	 return conn;
	 }
}
