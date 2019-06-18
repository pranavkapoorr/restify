package com.pranavkapoorr.restify.posts.repository;

import java.util.*;
import java.util.stream.IntStream;
import org.springframework.stereotype.Repository;
import com.pranavkapoorr.restify.posts.model.Post;

@Repository
public class PostRepository implements PostDao {
	private List<Post> postDb;
	
	public PostRepository() {
		this.postDb = new ArrayList<>();
		addDummyPosts();
	}
	
	@Override
	public List<Post> getAllPosts() {
		return this.postDb;
	}

	@Override
	public Post getPostById(int id) {
		return this.postDb.stream().filter((p) -> id == p.getId()).findAny().orElse(null);
	}

	@Override
	public Post addPost(Post post) {
		this.postDb.add(post);
		return post;
	}
	
	private void addDummyPosts() {
		IntStream.rangeClosed(1, 20).forEach(e->{
			this.addPost(
					new Post(
							e,
							e<=5?1:e<=10?2:e<=15?3:e<=20?4:e,
							"lorem Ipsum",
							"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"
							)
					);
		});
		
	}

}
