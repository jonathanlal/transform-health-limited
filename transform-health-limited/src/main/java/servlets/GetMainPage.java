package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetMainPage")
public class GetMainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetMainPage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		
		if(page.isEmpty()){
			page= "error.jsp";
//			response.sendRedirect("/error/");
		}
		
		
		
		if(page != null && page.equals("home.jsp")) {
		
			String v = request.getParameter("v");
			request.setAttribute("version", v);
		}
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

}
