package com.poterliu.bigdemo.controller;

import com.poterliu.bigdemo.model.User;
import com.poterliu.bigdemo.service.UserService;

public class UserController {
	private UserService userService;
	
	public Object login(User user){
		
		userService.login(user);
		return null;
	}
}
