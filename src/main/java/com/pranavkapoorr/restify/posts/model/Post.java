package com.pranavkapoorr.restify.posts.model;

import java.io.Serializable;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int userId;
	private String title;
	private String body;

}
