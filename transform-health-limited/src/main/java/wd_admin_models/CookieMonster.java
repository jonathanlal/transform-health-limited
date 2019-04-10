package wd_admin_models;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jasypt.util.password.StrongPasswordEncryptor;

import wd_admin_database.CookieMonsterDao;
import wd_admin_objects.UserObject;

public class CookieMonster {


	CookieMonsterDao cmdao = new CookieMonsterDao();

	//set & update cookie
	private void updateCookie(int userid, String cookie){
		cmdao.setCookieInDB(userid,cookie);
	}
	//get cookie
	public String getCookie(int userid){
		return cmdao.getCookieInDB(userid);
	}
	public UserObject getUserInfoByCookie(String cookie) {
		return cmdao.getUserInfoByCookieInDB(cookie);
	}
	
	public void setLoginCookie(int user_id, HttpServletResponse response){
     	StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
    	String encryptedCookie = passwordEncryptor.encryptPassword("tlas"+user_id+"salt");
		Cookie cookie = new Cookie(Globals.COOKIE_LOGIN,encryptedCookie);
		cookie.setMaxAge(10 * 365 * 24 * 60 * 60); //10 years apparently
		updateCookie(user_id, encryptedCookie);
		response.addCookie(cookie);
	}
	
	public int getUserIdFromCookie(HttpServletRequest request){
		int user_id = 0;
			Cookie[] cookies = request.getCookies();
		  //for each cookie user has
		  if(cookies != null && cookies.length>0) {
			  //for each cookie check if one is dedicated to diversified
		      for (int i = 0; i < cookies.length; i++) {
		          Cookie cookie=cookies[i];
		          String cookieName = cookie.getName();
			          if(cookieName.equals(Globals.COOKIE_LOGIN)){
			        	  //USER HAS diversified COOKIE SO GET user_id
			        	 String cookieValue = cookie.getValue();
			        	 UserObject u = getUserInfoByCookie(cookieValue);
			        	 user_id = u.getUser_id();
			        	 UserModel um = new UserModel();
			        	 um.setSessionVariables(request, u);
			        	 }
			          }
		       }
			return user_id;

	}
	public void destroyCookie(HttpServletResponse response, int user_id) {
		Cookie cookie = new Cookie(Globals.COOKIE_LOGIN,null);
		cookie.setMaxAge(0); 
		response.addCookie(cookie);
		updateCookie(user_id, null);
	}
	
}
