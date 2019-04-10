package wd_admin_models;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import wd_admin_database.UserDao;
import wd_admin_objects.UserObject;

public class UserModel {
	

	UserDao udao = new UserDao();
	
	public int registerNewUser(String user_name, String user_password, String user_email, String user_type){	
	return udao.newuserInDB(user_name, user_password, user_email, user_type); 
	
	}

//	public int registerNewUser(UserObject data) {
//		return udao.registerNewUserInDB(data);
//	}

	public boolean emailExists(String email) {
		return udao.emailAlreadyExistsInDB(email);
	}

	public UserObject getSessionVariablesByEmail(String user_email) {
		return udao.getSessionVariablesByEmailInDB(user_email);
	}

	public void setSessionVariables(HttpServletRequest request, int user_id, String user_type, String user_name, String user_email) {
		HttpSession session = (request.getSession());
    	session.setAttribute(Globals.USER_ID, user_id);
    	session.setAttribute(Globals.USER_TYPE, user_type);
    	session.setAttribute(Globals.USER_NAME, user_name);
    	session.setAttribute(Globals.USER_EMAIL, user_email);
	}
	public void setSessionVariables(HttpServletRequest request, UserObject u) {
		HttpSession session = (request.getSession());
    	session.setAttribute(Globals.USER_ID, u.getUser_id());
    	session.setAttribute(Globals.USER_TYPE, u.getAccount_type());
    	session.setAttribute(Globals.USER_NAME, u.getUser_name());
    	session.setAttribute(Globals.USER_EMAIL, u.getUser_email());
	}

	public int getUsersSize() {
		return udao.getUsersSize();
	}
	
}
