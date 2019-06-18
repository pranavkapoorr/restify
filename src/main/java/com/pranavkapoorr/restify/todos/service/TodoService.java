package com.pranavkapoorr.restify.todos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranavkapoorr.restify.todos.model.Todo;
import com.pranavkapoorr.restify.todos.repository.*;

@Service
public class TodoService implements TodoDao {
	@Autowired
	private TodoRepository repository;

	@Override
	public List<Todo> getAllTodos() {
		return this.repository.getAllTodos();
	}

	@Override
	public Todo getTodoById(int id) {
		return this.repository.getTodoById(id);
	}

	@Override
	public Todo addTodo(Todo todo) {
		return this.repository.addTodo(todo);
	}

}
