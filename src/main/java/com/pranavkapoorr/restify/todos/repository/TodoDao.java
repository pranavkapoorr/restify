package com.pranavkapoorr.restify.todos.repository;

import java.util.List;
import org.springframework.stereotype.Component;
import com.pranavkapoorr.restify.todos.model.Todo;

@Component
public interface TodoDao {
	public List<Todo> getAllTodos();
	public Todo getTodoById(int id);
	public Todo addTodo(Todo todo);

}
