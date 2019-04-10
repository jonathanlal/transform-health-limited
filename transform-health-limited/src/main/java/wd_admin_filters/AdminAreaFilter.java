package wd_admin_filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wd_admin_models.CheckAccess;

@WebFilter("/wd-admin/*")
public class AdminAreaFilter implements Filter {

    public AdminAreaFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String base = "/wd-admin/";
		String requri = ((HttpServletRequest) request).getRequestURI();
		
		CheckAccess ca = new CheckAccess();
	 	String page = "";
	 	
		if(ca.HasAccess(request)){
		
			if(requri.equals(base))
					page = "dashboard.jsp";
			else if((requri.equals(base+"login/") || requri.equals(base+"login")) && !ca.isLoggedInAndAdmin(request))
	    			page = "login.jsp";
			else if((requri.equals(base+"login/") || requri.equals(base+"login")) && ca.isLoggedInAndAdmin(request)){
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				httpResponse.sendRedirect("/wd-admin/");
				return;
//				page = "redirect-home"; //cool
			}
    			
	    	else if(requri.equals(base+"register/") || requri.equals(base+"register"))
					page = "register.jsp";
	    	else if(requri.equals(base+"forgot-password/") || requri.equals(base+"forgot-password"))
					page = "forgot.jsp";
	    	else if(requri.equals(base+"users/") || requri.equals(base+"users"))
	    			page = "users.jsp";


		}else{
			
			if(requri.equals(base+"login/") || requri.equals(base+"login")) //need to remove the ending "/" because if logged in... wd-admin/login/ can't fetch resources from that directory via dashboard
    			page = "login.jsp";
			else if(requri.equals(base+"register/") || requri.equals(base+"register"))
				page = "register.jsp";
			else if(requri.equals(base+"forgot-password/") || requri.equals(base+"forgot-password"))
				page = "forgot.jsp";
			else{
				request.setAttribute("error", ca.getError(request));
				page = "login.jsp";
			}
			
		}
		
	    request.getRequestDispatcher("/wd-admin/GetAdminAreaPage?page="+page).forward(request, response);
	    return;
	
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
