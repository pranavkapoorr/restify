package com.pranavkapoorr.restify.users.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pranavkapoorr.restify.users.model.User;
import com.pranavkapoorr.restify.users.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping(path = "/users",method = RequestMethod.GET,produces =  "application/json")
	public List<User> getUsers(){
		return service.getAllUsers();
	}
	@RequestMapping(path = "/users/{id}",method = RequestMethod.GET, produces =  "application/json")
	public User getUserById(@PathVariable(value = "id") int id){
		return service.getUserById(id);
	}
	
}
