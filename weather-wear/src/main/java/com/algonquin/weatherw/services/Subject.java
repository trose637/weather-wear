package com.algonquin.weatherw.services;

import com.algonquin.weatherw.model.User;

public abstract interface Subject {
	
	public void notifyObserver(final User user, final String message, final String action);
	
	public void add(Observer observer);
	
	public void remove(Observer observer);
	
	
	

}
