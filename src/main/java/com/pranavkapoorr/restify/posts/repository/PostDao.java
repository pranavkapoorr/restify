package com.pranavkapoorr.restify.posts.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.pranavkapoorr.restify.posts.model.Post;

@Component
public interface PostDao {
		public List<Post> getAllPosts();
		public Post getPostById(int id);
		public Post addPost(Post user);

}
