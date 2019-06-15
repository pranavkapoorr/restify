package com.pranavkapoorr.restify.users.model;

import java.io.Serializable;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
	private static final long serialVersionUID = -7658943801430098894L;
	private int id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
}
