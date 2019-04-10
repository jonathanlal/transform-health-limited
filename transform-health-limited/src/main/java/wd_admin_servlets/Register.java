package wd_admin_servlets;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.SecretKey;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasypt.util.password.StrongPasswordEncryptor;

import models.SendEmail;
import wd_admin_models.CookieMonster;
import wd_admin_models.LoginTimes;
import wd_admin_models.SecretCodes;
import wd_admin_models.UserModel;

@WebServlet({"/Register", "/register", "/verifyuser"})
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	
		String code = URLDecoder.decode(request.getParameter("c"), "UTF-8");
		String approve = request.getParameter("approve");
		SecretCodes sc = new SecretCodes();
		
        String encodedkey = sc.getKeyByCode(code);
        String status;
		if(encodedkey != null){
			
			
			String decodedCode = sc.decrypt(code, encodedkey);
//			System.out.println("CODE: "+decodedCode);
		    ArrayList<String> details = new ArrayList<String>(Arrays.asList(decodedCode.split("\\=\\&\\$\\&\\=")));
		    
			String user_email = details.get(0);
			String user_name = details.get(1);
			String user_password = details.get(2);
	    
			if(approve != null && approve.equals("yes")){
				status = "<h3 class=\"text-center font-weight-bold\" style=\"color:green !important\">User registration has been approved!<br>An email has been sent to them.</h3>";
	    	UserModel um = new UserModel();
  			um.registerNewUser(user_name, user_password, user_email, "admin");
  			
  			SendEmail se = new SendEmail();
  			se.confirmCompletedRegistration(user_name, user_email, "approved");
  			
			}else{
				status = "<h3 class=\"text-center font-weight-bold\" style=\"color:red !important\">User registration has been rejected!<br>An email has been sent to them.</h3>";
			SendEmail se = new SendEmail();
  			se.confirmCompletedRegistration(user_name, user_email, "rejected");
				
			}
			//delete the code here now!
			
			sc.deleteCode(code);
		}else{
			
			status = "<h3 class=\"text-center font-weight-bold\" style=\"color:red !important\">Requested url has expired.</h3>";
			
		}
		
		request.setAttribute("status", status);
        RequestDispatcher rd=request.getRequestDispatcher("confirmation.jsp");    
        rd.forward(request,response);    
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fullname = request.getParameter("fullname");
        String useremail = request.getParameter("email");
        String password = request.getParameter("password");
    	String seperator = "=&$&=";
    	
    	
    	UserModel um = new UserModel();
        
        boolean useremailNotEmpty = !useremail.isEmpty();
        boolean emailDoesNotExist = !um.emailExists(useremail);
        
        
        if(useremailNotEmpty && emailDoesNotExist){
        		
        	SecretCodes sc = new SecretCodes();
//        	SendEmail se = new SendEmail();
        	
        	StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        	String encryptedPassword = passwordEncryptor.encryptPassword(password);
        	
        	String code = useremail + seperator + fullname + seperator + encryptedPassword;
        	System.out.println("CODE: "+code);
        		
        	SecretKey secretKey = sc.generateSecretKey();//run this only once!! then use same key to decrypt...
        	String encryptedCode = sc.encrypt(code, secretKey); //get encryptedText (aka code) - code here is email encrypted. 
        	String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded()); //turn secretKey into String, so we can store in database with code
        	sc.newCode(encryptedCode, encodedKey); //save code and key in db
        	
        	SendEmail se = new SendEmail();
        	se.sendAdminNewUserRegistrationVerification(fullname, useremail, encryptedCode); // send email to admins
           	se.confirmReceivedRegistration(fullname, useremail); // send email to user registering saying an admin will accept it soon.
        		
			request.setAttribute("name", fullname);
			request.setAttribute("email", useremail);
			
			
			
			
			
			
			String status = "<div class=\"text-center\">";
			status += "<h1>Almost there, <strong>"+fullname+"</strong>...</h1>";
			status += "<h2>An admin now needs to verify your account.</h2>" ;
			status += "<h3>(You will receive an email once verified!)</h3></div>";

        		
			
			request.setAttribute("status", status);	
			
			
    	    RequestDispatcher rd=request.getRequestDispatcher("confirmation.jsp");    
            rd.forward(request,response);  
        		
	        
        }else{
        	String error = null;
        	
        	if(!useremailNotEmpty) {
        		error = "Email is empty!";
        	}
        	if(!emailDoesNotExist) {
        		error = "Email already associated to an account";
        	}
    	    request.setAttribute("error", error);
    	    RequestDispatcher rd=request.getRequestDispatcher("/wd-admin/register.jsp");    
            rd.forward(request,response);  
        	
        }
        	
        }
	
}