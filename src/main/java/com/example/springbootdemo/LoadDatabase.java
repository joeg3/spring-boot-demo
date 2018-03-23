package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {
	
	@Value("${my.prop.one}")
    private String myProp1;
	
	@Value("${my.prop.two}")
    private String myProp2;
	
	@Value("${my.prop.three}")
    private String myProp3;
	
	@Bean
	CommandLineRunner init(TaskRepository repository) {
		return args -> {
			Flux.just(
				new Task("Do taxes prop1 -> " + myProp1),
				new Task("Go running prop2 -> " + myProp2),
				new Task("Clean house prop3 -> " + myProp3))
			    .flatMap(repository::save)
			    .subscribe(System.out::println);
		};
	}

}
