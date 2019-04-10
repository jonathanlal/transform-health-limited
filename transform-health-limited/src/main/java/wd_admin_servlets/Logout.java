package wd_admin_servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import wd_admin_models.CookieMonster;
import wd_admin_models.Globals;



@WebServlet({"/Logout","/logout"})
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Logout() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = (request.getSession());
	 	 if(null == session.getAttribute(Globals.USER_ID)){ 
				Cookie cookie = new Cookie(Globals.COOKIE_LOGIN,null);
				cookie.setMaxAge(0); 
				response.addCookie(cookie);
//				request.setAttribute("login", "LOGGED OUT");
	 	     RequestDispatcher rd=request.getRequestDispatcher("index.jsp");   
		       rd.forward(request,response);    
		       return;
		}else{
			int user_id = (int) session.getAttribute(Globals.USER_ID);
			try{
			response.reset();
		    session.invalidate();
			
//			}
			}finally{
				
				//destroy cookie
		  		CookieMonster cm = new CookieMonster();
		  		cm.destroyCookie(response, user_id);
//	        		Cookie cookie = new Cookie("asktmk",null);
//	        		cookie.setMaxAge(0); 
//	        		response.addCookie(cookie);
//	        		cm.setCookie(userid, null);
//					request.setAttribute("logout", "LOGGED OUT");
//				request.setAttribute("login", "LOGGED OUT");
				   RequestDispatcher rd=request.getRequestDispatcher("index.jsp");    
		             rd.forward(request,response);  
			}	

	}
	}

}
