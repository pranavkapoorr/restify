package com.pranavkapoorr.restify.users.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pranavkapoorr.restify.users.model.Address;
import com.pranavkapoorr.restify.users.model.Company;
import com.pranavkapoorr.restify.users.model.User;

@Repository
public class UserRepository implements UserDao{
	List<User> userDb;
	
	public UserRepository() {
		this.userDb = new ArrayList<>();
		this.userDb.add(new User(
				1,
				"Pranav Kapoor",
				"pranavkapoorr",
				"pranavkapoorr@gmail.com",
				new Address("Oxford Street", "London", "ME52A1", "UK"),
				"7488706094",
				"pranavkapoorr.com",
				new Company("pranavkapoorr", "IT")
				));
	}
	
	@Override
	public List<User> getAllUsers() {
		return this.userDb;
	}

	@Override
	public User getUserById(int id) {
		return this.userDb.stream().filter((u) -> id == u.getId()).findAny().orElse(null);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
