package wd_admin_servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wd_admin_models.PageViews;


@WebServlet("/PageView")
public class NewPageView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewPageView() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageViews pg = new PageViews();
		System.out.print("FIRED");
		pg.recordVisit(request.getParameter("url"),request);
	}
}
