package com.algonquin.weatherw.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.algonquin.weatherw.services.ProfileService;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	
	ProfileService pService = new ProfileService();
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

		    String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        System.out.println(username);
	        System.out.println(password);
	        
	        boolean success = pService.login(username, password);
	        if(success) {
	        	
	
	        	HttpSession session=request.getSession();  
	            session.setAttribute("username",username);

	        	String destination = "Dashboard.jsp";
	        	RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
	        	requestDispatcher.forward(request, response);
	        	
	        } else {
	        	
	        	String destination = "Login.jsp";
	        	RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
	        	request.setAttribute("msg", "Login Failed");
	        	request.setAttribute("style", "alert alert-danger");
	        	requestDispatcher.forward(request, response);
	        }
	       
	  }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

		  response.getOutputStream().println("OK");

	  }
	  
	  
}
