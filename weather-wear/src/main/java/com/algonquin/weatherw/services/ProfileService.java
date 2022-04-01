package com.algonquin.weatherw.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//
import com.algonquin.weatherw.dao.ApplicationDao;
import com.algonquin.weatherw.exceptions.UserNotFoundException;
import com.algonquin.weatherw.model.User;

public class ProfileService implements Subject{
	
	ApplicationDao appDao = new ApplicationDao();
	EmailService eService = new EmailService();
	
	
	List<Observer> observers = new ArrayList();
	
	public void register(User user, String body){
	
			try {
				appDao.insertUser(user);
				this.notifyObserver(user, body, "insert");
				//eService.sendEmail(user.getEmail(), "weatherWear@gmail.com", body , "Weather Wear Email Verification");
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
	// in progress
	public void recoverPassword(String email){
		try {
			String pWord = appDao.returnPassword(email);
			String body = "Your Weather wear password is: " + pWord;
			eService.sendEmail(email, "weatherWear@gmail.com", body , "Weather Wear Password Recovery");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void validateEmail(String token) {
		
		try {
			appDao.updateUser(token);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void notifyObserver(final User user, final String message, final String action) {	
		observers.forEach(obs -> {
			obs.update(user, action, message);
			System.out.println("notify successful");
		});
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);
		System.out.println("oberserver added");
	}

	@Override
	public void remove(Observer observer) {	
		observers.remove(observer);
	}
}
