package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import models.Leads;
import models.SendEmail;
import wd_admin_models.Leads;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContactServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String msg = request.getParameter("msg");
		String phone = request.getParameter("phone"); //source
		String url = request.getParameter("url");
//		System.out.println("URL: "+url);
		
		//to get view_id we need to get last inserted result where url = /contact and j_session_id matches current one.
		
		
		
		
		if(name != null && !name.isEmpty()){
		name = name.substring(0, 1).toUpperCase() + name.substring(1); //UPPERCASE FIRST LETTER
		}else{
			name = "Someone";
		}
		SendEmail sm = new SendEmail();
		sm.sendAdminContactLead(name,email,phone,msg); //ADMIN 
		sm.sendContactMailConfirmation(name,email,msg); // USER CONFIRMATION EMAIL

		Leads l = new Leads();
		l.newLead(name, email, phone, msg, request, url);
	
	}
	
	
	
	


}
