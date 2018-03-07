package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class TaskController {
	
	private final TaskRepository repository;
	
	public TaskController(TaskRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/tasks")
	public Flux<Task> listing() {
		return repository.findAll();
	}

}
