package com.algonquin.weatherw.servlets;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.algonquin.weatherw.model.User;
import com.algonquin.weatherw.services.ProfileService;

@SuppressWarnings("serial")
public class RegistrationServlet extends HttpServlet{
	
	ProfileService service = new ProfileService();
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

		    String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        String email = request.getParameter("email");
	        String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("LastName");
	        String token = UUID.randomUUID().toString();
	        
	        
	        User user = new User(firstName, lastName, email, password, username, token, "pending");
	        
	        String body = "please click the link to validate your weather wear email: "+ request.getRequestURL()+"?token="+ token;
	        service.register(user, body);
	        
		
	  }
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

		  String token = request.getParameter("token");
		  if(token != null) {
			  service.validateEmail(token);
			  response.getOutputStream().println("Email Verification Successful");
		  }
		  
		 
		  
		

	  }
	  
	  
}
