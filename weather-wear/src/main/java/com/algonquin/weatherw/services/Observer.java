package com.algonquin.weatherw.services;

import com.algonquin.weatherw.model.User;

public abstract interface Observer {

	public void update(User user, String action, String message);
	
}
