package com.algonquin.weatherw.servlets;

import java.io.IOException;

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
	        
	        
	        User user = new User(firstName, lastName, email, password, username);
	     
	        service.register(user);
	        
		
	  }
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

		  response.getOutputStream().println("OK");

	  }
	  
	  
}
