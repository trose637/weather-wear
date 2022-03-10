package com.algonquin.weatherw.dao;

import java.sql.Connection;
import java.sql.SQLException;
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
    		s.setString(3, user.getPassword());
    		s.setString(4, user.getUserName());
    		s.setString(5, user.getEmail());
    		s.setString(6, );
    		s.execute();
    		
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    		
    	}
    	c.close();
    	return 0;
    }

}
