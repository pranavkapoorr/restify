package com.pranavkapoorr.restify.posts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pranavkapoorr.restify.posts.model.Post;
import com.pranavkapoorr.restify.posts.service.PostService;

@RestController
public class PostController {
	@Autowired
	PostService service;

	@RequestMapping(path = "/posts",method = RequestMethod.GET,produces =  "application/json")
	public List<Post> getPosts(){
		return service.getAllPosts();
	}
	@RequestMapping(path = "/posts/{id}",method = RequestMethod.GET, produces =  "application/json")
	public Post getPostById(@PathVariable(value = "id") int id){
		return service.getPostById(id);
	}
}
