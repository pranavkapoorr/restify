package com.pranavkapoorr.restify.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranavkapoorr.restify.users.model.User;
import com.pranavkapoorr.restify.users.repository.UserDao;
import com.pranavkapoorr.restify.users.repository.UserRepository;

@Service
public class UserService implements UserDao{
	@Autowired
	UserRepository repository;

	@Override
	public List<User> getAllUsers() {
		return this.repository.getAllUsers();
	}

	@Override
	public User getUserById(int id) {
		return this.repository.getUserById(id);
	}

	@Override
	public User addUser(User user) {
		return this.repository.addUser(user);
	}
	
	

}
