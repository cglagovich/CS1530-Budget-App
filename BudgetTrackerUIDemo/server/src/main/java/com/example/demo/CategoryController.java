package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class CategoryController {
    private CategoryRepository repository;

    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all-categories")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Category> categories() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}