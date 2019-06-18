package com.pranavkapoorr.restify.users.repository;

import java.util.List;
import org.springframework.stereotype.Component;
import com.pranavkapoorr.restify.users.model.User;

@Component
public interface UserDao {
	public List<User> getAllUsers();
	public User getUserById(int id);
	public User addUser(User user);
	
}
