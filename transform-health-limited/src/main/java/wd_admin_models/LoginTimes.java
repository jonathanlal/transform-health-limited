package wd_admin_models;

import javax.servlet.http.HttpServletRequest;

import wd_admin_database.LoginTimesDao;
import wd_admin_objects.ViewObject;


public class LoginTimes {

	LoginTimesDao ltdao = new LoginTimesDao();
	
	 public void newLogin(HttpServletRequest request,int user_id) {
	       
		 		Views v = new Views();
		 	   ViewObject vo = new ViewObject();		 	
		 	   
			 	 vo.setBrowser(v.getClientBrowser(request));
			 	 vo.setDate(GetDate.now());
			 	 vo.setDevice(v.getDeviceType(request));
			 	 vo.setFullagent(v.getUserAgent(request));
			 	 vo.setIp(v.getClientIpAddr(request));
			 	 vo.setOs(v.getClientOS(request));
			 	 vo.setReferrer(v.getReferer(request));
			 	 vo.setSession_id(v.getSessionID(request));
//			 	 vo.setUrl(v.getURL(request));
			 	 vo.setUser_id(v.getUserIDFromCookie(request));
		 	
		        ltdao.recordLoginInDB(vo);
	    }
	
	
}
