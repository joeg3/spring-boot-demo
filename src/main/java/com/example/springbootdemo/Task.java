package com.example.springbootdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Task {
	
	@Id
	private String id;
	private String title;
	
	public Task(String title) {
		this.title = title;
	}

}
