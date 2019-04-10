package wd_admin_models;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CheckAccess {
	
	
	public boolean HasAccess(ServletRequest request){
		boolean access = false;
		if(isLoggedInAndAdmin(request)){
			access = true;
		}else{
			CookieMonster cm = new CookieMonster();
			int user_id = cm.getUserIdFromCookie((HttpServletRequest) request);
			if(user_id != 0 && isLoggedInAndAdmin(request)){
				access = true;
			}
		}
		return access;
	}
	public boolean isLoggedInAndAdmin(ServletRequest request){
		HttpSession session = (((HttpServletRequest) request).getSession());
		boolean access = false;
		if(null != session.getAttribute(Globals.USER_ID) && session.getAttribute(Globals.USER_TYPE).equals("admin")){
			access = true;
		}
		return access;
	}

	public String getError(ServletRequest request) {
		HttpSession session = (((HttpServletRequest) request).getSession());
		String error = "";
		if(null == session.getAttribute(Globals.USER_ID)){
			error = "You are not logged in!";
		}else{
			//they are logged in but just trying to access wrong resource
			error = "You do not have access to view the requested page!";
		}
		return error;
	}

//	public boolean isAdditionsMember(ServletRequest request) {
//		HttpSession session = (((HttpServletRequest) request).getSession());
//		boolean access = false;
//		if(null != session.getAttribute("user_type") && session.getAttribute("user_type").equals("additions")){
//			access = true;
//		}
//		return access;
//	}
//	public boolean isGoldMember(ServletRequest request) {
//		HttpSession session = (((HttpServletRequest) request).getSession());
//		boolean access = false;
//		if(null != session.getAttribute("user_type") && session.getAttribute("user_type").equals("gold")){
//			access = true;
//		}
//		return access;
//	}
//	public boolean isPlatinumMember(ServletRequest request) {
//		HttpSession session = (((HttpServletRequest) request).getSession());
//		boolean access = false;
//		if(null != session.getAttribute("user_type") && session.getAttribute("user_type").equals("platinum")){
//			access = true;
//		}
//		return access;
//	}
//	public boolean isSalesMember(ServletRequest request) {
//		HttpSession session = (((HttpServletRequest) request).getSession());
//		boolean access = false;
//		if(null != session.getAttribute("user_type") && session.getAttribute("user_type").equals("sales")){
//			access = true;
//		}
//		return access;
//	}
	
	

}
