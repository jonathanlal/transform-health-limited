package wd_admin_models;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import wd_admin_database.ViewsDao;
import wd_admin_objects.ViewObject;


public class Views {
	
	ViewsDao vdao = new ViewsDao();

	public ViewObject getAllViewInfoByID(int viewid) {
		return vdao.getAllViewInfoByIDInDB(viewid);
	}

	public int getViewCountByArticle(int articleid) {
		return vdao.getViewCountByArticleInDB(articleid);
	}
	public void restoreViewByID(int viewid) {
		vdao.restoreViewByIDInDB(viewid);
	}
	public void deleteViewByID(int id) {
		vdao.deleteViewByID(id);
	}
	public int getViewsSize() {
		return vdao.getViewsSizeInDB();
	}
	
	
	public int getViewIDBySessionIDAndURL(HttpServletRequest request, String url) {
		String JSessionID = getSessionID(request);
//		System.out.println("SESSION ID: "+JSessionID);
		int view_id = vdao.getViewIDBySessionIDAndURLInDB(JSessionID, url);
//		System.out.println("VIEW ID: "+view_id);
		return view_id;
	}
	
	
	
	//VIEW STUFF
	
	 public void newView(String url, HttpServletRequest request) {
			String date = GetDate.now();
	        final String referer = getReferer(request);
	        final String clientIpAddr = getClientIpAddr(request);
	        final String clientOS = getClientOS(request);
	        final String clientBrowser = getClientBrowser(request);
	        final String userAgent = getUserAgent(request);
	        final String deviceType = getDeviceType(request);
	        final String JSessionID = getSessionID(request);
	        final int user_id = getUserIDFromCookie(request);
	        
		        ViewObject v = new ViewObject();
		        v.setBrowser(clientBrowser);
		        v.setOs(clientOS);
		        v.setIp(clientIpAddr);
		        v.setReferrer(referer);
		        v.setFullagent(userAgent);
		        v.setDate(date);
		        v.setUrl(url);
		        v.setDevice(deviceType);
		        v.setSession_id(JSessionID);
		        v.setUser_id(user_id);
		        
		        vdao.newViewInDB(v);
	    }
	
	
	
	
	 
	 
	 
	 
	 
	 
	 //this only returns the url of the servlet... need to pass url as parameter...
//	 public String getURL(HttpServletRequest request){
//		 return request.getRequestURL().toString();
//	 }
	 public int getUserIDFromCookie(HttpServletRequest request){
		    CookieMonster cm = new CookieMonster();
			return cm.getUserIdFromCookie(request);
	 }
	 public String getSessionID(HttpServletRequest request){
			HttpSession session = (((HttpServletRequest) request).getSession());
			return session.getId();
	 }
	    public String getReferer(HttpServletRequest request) {
	        final String referer = request.getHeader("referer");
	        return referer;
	    }
	    //http://stackoverflow.com/a/18030465/1845894
	    public String getClientIpAddr(HttpServletRequest request) {
	        String ip = request.getHeader("X-Forwarded-For");
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("Proxy-Client-IP");
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("WL-Proxy-Client-IP");
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("HTTP_CLIENT_IP");
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getRemoteAddr();
	        }
	        return ip;
	    }
	    //http://stackoverflow.com/a/18030465/1845894
	    public String getClientOS(HttpServletRequest request) {
	        final String browserDetails = request.getHeader("User-Agent");
	        //=================OS=======================
	        final String lowerCaseBrowser = browserDetails.toLowerCase();
	        if (lowerCaseBrowser.contains("windows")) {
	            return "Windows";
	        } else if (lowerCaseBrowser.contains("mac")) {
	            return "Mac";
	        } else if (lowerCaseBrowser.contains("x11")) {
	            return "Unix";
	        } else if (lowerCaseBrowser.contains("android")) {
	            return "Android";
	        } else if (lowerCaseBrowser.contains("iphone")) {
	            return "IPhone";
	        } else {
	            return "UnKnown, More-Info: " + browserDetails;
	        }
	    }
	    //http://stackoverflow.com/a/18030465/1845894
	    public String getClientBrowser(HttpServletRequest request) {
	        final String browserDetails = request.getHeader("User-Agent");
	        final String user = browserDetails.toLowerCase();
	        String browser = "";
	        //===============Browser===========================
	        if (user.contains("msie")) {
	            String substring = browserDetails.substring(browserDetails.indexOf("MSIE")).split(";")[0];
	            browser = substring.split(" ")[0].replace("MSIE", "IE") + "-" + substring.split(" ")[1];
	        } else if (user.contains("safari") && user.contains("version")) {
	            browser = (browserDetails.substring(browserDetails.indexOf("Safari")).split(" ")[0]).split(
	                    "/")[0] + "-" + (browserDetails.substring(
	                    browserDetails.indexOf("Version")).split(" ")[0]).split("/")[1];
	        } else if (user.contains("opr") || user.contains("opera")) {
	            if (user.contains("opera"))
	                browser = (browserDetails.substring(browserDetails.indexOf("Opera")).split(" ")[0]).split(
	                        "/")[0] + "-" + (browserDetails.substring(
	                        browserDetails.indexOf("Version")).split(" ")[0]).split("/")[1];
	            else if (user.contains("opr"))
	                browser = ((browserDetails.substring(browserDetails.indexOf("OPR")).split(" ")[0]).replace("/",
	                                                                                                           "-")).replace(
	                        "OPR", "Opera");
	        } else if (user.contains("chrome")) {
	            browser = (browserDetails.substring(browserDetails.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
	        } else if ((user.indexOf("mozilla/7.0") > -1) || (user.indexOf("netscape6") != -1) || (user.indexOf(
	                "mozilla/4.7") != -1) || (user.indexOf("mozilla/4.78") != -1) || (user.indexOf(
	                "mozilla/4.08") != -1) || (user.indexOf("mozilla/3") != -1)) {
	            //browser=(userAgent.substring(userAgent.indexOf("MSIE")).split(" ")[0]).replace("/", "-");
	            browser = "Netscape-?";
	        } else if (user.contains("firefox")) {
	            browser = (browserDetails.substring(browserDetails.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
	        } else if (user.contains("rv")) {
	            browser = "IE";
	        } else {
	            browser = "UnKnown, More-Info: " + browserDetails;
	        }
	        return browser;
	    }
	    public String getDeviceType(HttpServletRequest request){
	    	String type = "Desktop";
	    	String ua=request.getHeader("User-Agent").toLowerCase();
	    	if(ua.matches("(?i).*((android|bb\\d+|meego).+mobile|avantgo|bada\\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|mobile.+firefox|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\\.(browser|link)|vodafone|wap|windows ce|xda|xiino).*")||ua.substring(0,4).matches("(?i)1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\\-|your|zeto|zte\\-")) {
	    	type = "Mobile";
	    	}
	    	return type;
	    }
	    public String getUserAgent(HttpServletRequest request) {
	        return request.getHeader("User-Agent");
	    }


	
	
	
	
	
	
	
	

}
