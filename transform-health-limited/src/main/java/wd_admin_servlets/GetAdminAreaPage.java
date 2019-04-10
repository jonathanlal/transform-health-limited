package wd_admin_servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wd_admin_models.AdminModel;
import wd_admin_objects.DashboardObject;
import wd_admin_objects.UserObject;

@WebServlet("/wd-admin/GetAdminAreaPage")
public class GetAdminAreaPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetAdminAreaPage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		System.out.println("PAGE: "+page);
		
		if(page.isEmpty()){
			page= "error.jsp";
		}else{
			AdminModel am = new AdminModel();
			if(page.equals("users.jsp")){
				List<UserObject> users = am.getAllUsers();
				request.setAttribute("users", users);
			}
			
			if(page.equals("dashboard.jsp") || page.equals("redirect-home")){
				DashboardObject dash = am.getDashBoardInfo();
				request.setAttribute("dashboard", dash);
				page = "dashboard.jsp";
			}
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
