package com.pranavkapoorr.restify.todos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pranavkapoorr.restify.todos.model.Todo;
import com.pranavkapoorr.restify.todos.service.TodoService;

@RestController
public class TodoController {
	@Autowired
	TodoService service;

	@RequestMapping(path = "/todos",method = RequestMethod.GET,produces =  "application/json")
	public List<Todo> getTodos(){
		return service.getAllTodos();
	}
	@RequestMapping(path = "/todos/{id}",method = RequestMethod.GET, produces =  "application/json")
	public Todo getTodoById(@PathVariable(value = "id") int id){
		return service.getTodoById(id);
	}
}
