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

import org.jasypt.util.password.StrongPasswordEncryptor;

import wd_admin_models.CookieMonster;
import wd_admin_models.Encrypt;
import wd_admin_models.UserModel;
import wd_admin_objects.UserObject;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String user_email = request.getParameter("email");
	String user_pass = request.getParameter("password");
	
	String url;
	Encrypt e = new Encrypt();
	if(e.validate(user_email, user_pass)){
		
			UserModel um = new UserModel();
			UserObject uo = um.getSessionVariablesByEmail(user_email);
			
  			//SET SESSION VARIABLES
    		um.setSessionVariables(request, uo.getUser_id(), uo.getAccount_type(), uo.getUser_name(), uo.getUser_email());
    		
			//SET/UPDATE COOKIE
    		CookieMonster cm = new CookieMonster();
    		cm.setLoginCookie(uo.getUser_id(), response);
    		
			url = "/wd-admin/"; // '/member/', '/agent/'
    		
			 response.sendRedirect(url);
			 return;
			
			
		}else{
			url = "/wd-admin/login.jsp";
			String error = "";
			UserModel um = new UserModel();
			if(um.emailExists(user_email)){
				error = "Password incorrect!";
			}else{
				error = "Account by this email does not exist!";
			}
			
			request.setAttribute("error", error);
		}
	
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	
	
//	}else{
//		url = "login.jsp";
//		request.setAttribute("error", "User does not exist");
//	}
	
//	url = "login.jsp";
//	request.setAttribute("error", "Login functionality not setup yet!");
	

	
	
	
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		
		
		request.setAttribute("type", type);
		
		RequestDispatcher rd = request.getRequestDispatcher("/wd-admin/login.jsp");
		rd.forward(request, response);
		
	}

}
