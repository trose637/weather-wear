package com.algonquin.weatherw.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.algonquin.weatherw.exceptions.UserNotFoundException;
import com.algonquin.weatherw.model.User;
import com.algonquin.weatherw.services.ApplicationService;

public class ApplicationDao implements ApplicationService{

    public ApplicationDao() {

    }
    
    public int insertUser(User user) throws SQLException {
    	
    	Connection c = DBConnection.getConnectionToDatabase();
    	try {
    		
    		String insert = "insert into Capstone.User (FirstName, LastName, UserName, Password, Email, Token) values(?,?,?,?,?,?)";
    		java.sql.PreparedStatement s = c.prepareStatement(insert);
    		s.setString(1, user.getFirstName());
    		s.setString(2, user.getLastName());
    		s.setString(3, user.getUserName());
    		s.setString(4, user.getPassword());
    		s.setString(5, user.getEmail());
    		s.setString(6, user.getToken());
    		s.execute();	
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    		
    	}
    	c.close();
    	return 0;
    }

  public int updateUser(String token) throws SQLException {
    	
    	Connection c = DBConnection.getConnectionToDatabase();
    	try {
    		
    		String update = "update Capstone.User set UserStatus = 'Verified' where Token = ?";
    		java.sql.PreparedStatement s = c.prepareStatement(update);
    		s.setString(1, token);
    		s.execute();	
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	c.close();
    	return 0;
    }
  
  public User returnUser(String username, String password) throws SQLException{
	  Connection c = DBConnection.getConnectionToDatabase();
	  User user = null;
	  try {
  		
  		String select = "select * from Capstone.User where Username = ? and Password = ?";
  		java.sql.PreparedStatement s = c.prepareStatement(select);
  		s.setString(1, username);
  		s.setString(2, password);
  		ResultSet rSet = s.executeQuery();	
  		if(rSet.next()) {
  			String uName = rSet.getString("UserName");
  			String pWord = rSet.getString("Password");
  			String status = rSet.getString("UserStatus");
  			user = new User("", "", "", pWord, uName, "", status);
  		} else {
  			throw new UserNotFoundException();
  		}
  		
  	} catch (SQLException e) {
  		e.printStackTrace();
  		
  	} catch (UserNotFoundException e) {
		//hb
		e.printStackTrace();
	}
  	c.close();
  	return user;
  }
  
  //in progress
  public String returnPassword(String email) throws SQLException{
	  
	  Connection c = DBConnection.getConnectionToDatabase();
	  String pWord = null;
	  
  	try {
  		String select = "select * from Capstone.User where email = ?";
  		java.sql.PreparedStatement s = c.prepareStatement(select);
  		s.setString(1, email);
  		ResultSet rSet = s.executeQuery();		
  		if(rSet.next()) {
  			pWord = rSet.getString("Password");
  		} else {
  			throw new UserNotFoundException();
  		}
  		
  	} catch (SQLException e) {
  		e.printStackTrace();
  		
  	} catch (UserNotFoundException e) {
		//hb
		e.printStackTrace();
	}
  	c.close();
  	return pWord;
  }
  }
  

