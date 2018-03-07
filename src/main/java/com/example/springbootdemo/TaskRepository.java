package com.example.springbootdemo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TaskRepository extends ReactiveCrudRepository<Task, String> {

}
