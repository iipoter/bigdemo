package com.poterliu.bigdemo.service.impl;

import com.poterliu.bigdemo.mapper.UserMapper;
import com.poterliu.bigdemo.model.User;
import com.poterliu.bigdemo.service.UserService;

public class UserServiceImpl implements UserService {
	private UserMapper userMapper; 

	@Override
	public User login(User user) {
		userMapper.getUserByName(user.getName());
		return null;
	}

	@Override
	public User updateUser(User user) {
		userMapper.updateUser(user);
		return null;
	}

	@Override
	public User addUser(User user) {
		userMapper.addUser(user);
		return null;
	}

	@Override
	public void deleteUserById(String id) {
		userMapper.deleteUser(id);
	}

}
