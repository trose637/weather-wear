package com.algonquin.weatherw.servlets;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.algonquin.weatherw.model.User;
import com.algonquin.weatherw.services.ProfileService;

@SuppressWarnings("serial")
public class PasswordServlet extends HttpServlet{
	
	ProfileService pService = new ProfileService();
	
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        String email = request.getParameter("email");
	        pService.recoverPassword(email);
	        
	        String destination = "Login.jsp";
	      	RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
	      	request.setAttribute("msg", "Please check email for Password");
	      	request.setAttribute("style", "alert alert-success");
	      	requestDispatcher.forward(request, response);
		        
		
	  }

}
