package com.pranavkapoorr.restify.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranavkapoorr.restify.users.model.User;
import com.pranavkapoorr.restify.users.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping(path = "/users",method = RequestMethod.GET)
	public List<User> getUsers(){
		return service.getAllUsers();
	}
}
