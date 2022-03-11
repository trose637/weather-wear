package com.algonquin.weatherw.services;

import java.sql.SQLException;

import com.algonquin.weatherw.dao.ApplicationDao;
import com.algonquin.weatherw.model.User;

public class ProfileService {
	
	ApplicationDao appDao = new ApplicationDao();
	EmailService eService = new EmailService();
	
	public void register(User user, String body){
	
			try {
				appDao.insertUser(user);
				eService.sendEmail(user.getEmail(), "weatherWear@gmail.com", body , "Weather Wear Email Verification");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
		
	
	
	public boolean login(String username, String password) {
		
		try {
			User user = appDao.returnUser(username, password);
			if(user != null) {
				return(user.getStatus().equals("Verified"));
			}
			return false;
				
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	public void validateEmail(String token) {
		
		try {
			appDao.updateUser(token);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
