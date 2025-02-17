package com.example.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

//@JsonIgnoreProperties({"id"})
@Schema(description = "User entity")
public class User {

	@Schema(description = "Unique identifier of the user", example = "1")
	private int id;
	
	@Schema(description = "Name of the user", example = "John")
	private String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
