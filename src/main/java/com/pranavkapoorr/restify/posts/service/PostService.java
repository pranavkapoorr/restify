package com.pranavkapoorr.restify.posts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranavkapoorr.restify.posts.model.Post;
import com.pranavkapoorr.restify.posts.repository.PostDao;
import com.pranavkapoorr.restify.posts.repository.PostRepository;

@Service
public class PostService implements PostDao {
	@Autowired
	PostRepository repository;
	
	@Override
	public List<Post> getAllPosts() {
		return this.repository.getAllPosts();
	}

	@Override
	public Post getPostById(int id) {
		return this.repository.getPostById(id);
	}

	@Override
	public Post addPost(Post post) {
		return this.repository.addPost(post);
	}

}
