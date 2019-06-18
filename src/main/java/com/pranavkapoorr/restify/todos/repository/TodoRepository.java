package com.pranavkapoorr.restify.todos.repository;

import java.util.*;
import java.util.stream.IntStream;
import org.springframework.stereotype.Repository;
import com.pranavkapoorr.restify.todos.model.Todo;

@Repository
public class TodoRepository implements TodoDao {
	private List<Todo> todoDb;
	
	public TodoRepository() {
		this.todoDb = new ArrayList<>();
		addDummyTodos();
	}

	@Override
	public List<Todo> getAllTodos() {
		return this.todoDb;
	}

	@Override
	public Todo getTodoById(int id) {
		return this.todoDb.stream().filter((t) -> id == t.getId()).findAny().orElse(null);
	}

	@Override
	public Todo addTodo(Todo todo) {
		this.todoDb.add(todo);
		return todo;
	}
	
	private void addDummyTodos() {
		IntStream.rangeClosed(1, 50).forEach(e->{
			this.addTodo(
					new Todo(
							e,
							e<=10?1:e<=20?2:e<=30?3:e<=40?4:e<=50?5:e,
							"lorem Ipsum "+ e,
							e%4==0?true:false
							)
					);
		});
	}

}
