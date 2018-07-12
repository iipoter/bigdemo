package com.poterliu.bigdemo.mapper;

import com.poterliu.bigdemo.model.User;

public interface UserMapper {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(String id);
	
	public User getUserByName(String name);

}
