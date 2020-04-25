package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Bean
    ApplicationRunner init(CategoryRepository repository) {
        return args -> {
            Stream.of("Dining Out", "Shopping", "Groceries", "Memberships", "Gas").forEach(name -> {
                Category category = new Category();
                category.setName(name);
				category.setBudget(50.0);
                repository.save(category);
            });
            repository.findAll().forEach(System.out::println);
        };
    }

}
