package filters;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.google.apphosting.utils.remoteapi.RemoteApiPb.Request;

@WebFilter({ "/about/", "/about", "/inspiration/", "/inspiration", "/products/*", "/products", "/services/*", "/services", "/contact/", "/contact", "/disclaimer", "/disclaimer/", "/privacy-policy", "/privacy-policy/", "/terms", "/terms/", "/cookie-policy", "/cookie-policy/", "/bootcamp/","/bootcamp", "/home.jsp", "/*" })
public class MainFilter implements Filter {

    public MainFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
			String requri = ((HttpServletRequest) request).getRequestURI();

		 	String page = "";
		 	boolean continueChain = false;
		 
	    	if(requri.equals("/"))
    			page = "index.jsp";
	    	
	    	else if(requri.equals("/test/") || requri.equals("/test"))
    			page = "home.jsp";
		 	
	    	else if(requri.equals("/error/") || requri.equals("/error"))
    			page = "error.jsp";
	    	
	    	else if(requri.equals("/about/") || requri.equals("/about"))
	    			page = "about.jsp";
	    	
	    	else if(requri.equals("/bootcamp/") || requri.equals("/bootcamp"))
    			page = "bootcamp.jsp";
	    	
	    	else if(requri.equals("/inspiration/") || requri.equals("/inspiration"))
    			page = "inspiration.jsp";
	    	
	    	else if(requri.equals("/products/") || requri.equals("/products"))
	    			page = "products.jsp";
	    	
	    	else if(requri.equals("/products/transform-cryotherapy-chamber/") || requri.equals("/products/transform-cryotherapy-chamber"))
		    		page = "cryo-therapy-chamber.jsp";
		    	
	    	else if(requri.equals("/products/transform-slimline-model/") || requri.equals("/products/transform-slimline-model"))
		    		page = "slimline-model.jsp";
		    	
	    	else if(requri.equals("/products/transform-fitness-model/") || requri.equals("/products/transform-fitness-model"))
		    		page = "fitness-model.jsp";
		    	
	    	else if(requri.equals("/products/transform-superior-therapy-model/") || requri.equals("/products/transform-superior-therapy-model"))
		    		page = "fitness-model.jsp";
		    	
	    	else if(requri.equals("/products/transform-body-roller/") || requri.equals("/products/transform-body-roller"))
		    		page = "slimroll-massage.jsp";
	    	
	    	else if(requri.equals("/services/") || requri.equals("/services"))
	    			page = "services.jsp";

	    	else if(requri.equals("/contact/") || requri.equals("/contact"))
	    			page = "contact.jsp";
	    	
	    	else if(requri.equals("/disclaimer/") || requri.equals("/disclaimer"))
	    			page = "disclaimer.jsp";	
	    	
	    	else if(requri.equals("/privacy-policy/") || requri.equals("/privacy-policy"))
	    			page = "privacy.jsp";	
	    	
	    	else if(requri.startsWith("/wd-admin/") || isAServlet(request))
	    		continueChain = true;
	    	
	    	if(!continueChain){	
	    		
		    request.getRequestDispatcher("/GetMainPage?page="+page).forward(request, response);
		    return;
		    
	    	}else{
	    		chain.doFilter(request, response);
	    	}
	    	
	}
	public boolean isAServlet(ServletRequest request){
		boolean check = false;
	    ServletContext servletContext = ((HttpServletRequest) request).getSession().getServletContext();
		Map<String,? extends ServletRegistration> servlets = servletContext.getServletRegistrations();
		
		for (Entry<String, ? extends ServletRegistration> entry : servlets.entrySet())
		{
			
			if(entry.getValue().getMappings().toString().equals("["+((HttpServletRequest) request).getRequestURI()+"]"))
				check = true;
//			System.out.println(entry.getValue().getMappings().toString());
//		    System.out.println(entry.getKey() + " / " + entry.getValue().getMappings().toString());
		}
		
		
		return check;
	}
	


	public void init(FilterConfig fConfig) throws ServletException {
	}

}
