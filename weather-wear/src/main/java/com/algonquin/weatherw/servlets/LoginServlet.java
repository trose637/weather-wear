package com.algonquin.weatherw.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

		    String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        System.out.println(username);
	        System.out.println(password);

	  }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

		  response.getOutputStream().println("OK");

	  }
}
