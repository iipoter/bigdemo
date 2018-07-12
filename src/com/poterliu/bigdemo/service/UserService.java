package com.poterliu.bigdemo.service;

import com.poterliu.bigdemo.model.User;

public interface UserService {
	public User login(User user);
	
	public User updateUser(User user);
	
	public User addUser(User user);
	
	public void deleteUserById(String id);
}
