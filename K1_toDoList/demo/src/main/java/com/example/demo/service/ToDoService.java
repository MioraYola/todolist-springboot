package com.example.demo.service;

import com.example.demo.entity.ToDo;
import com.example.demo.repository.toDoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ToDoService {

    private final toDoRepository repository;

    public ToDoService(toDoRepository repository) {
        this.repository = repository;
    }

    public List<ToDo> getAll() {
        return repository.findAll();
    }

    public ToDo create(ToDo todo) {
        return repository.save(todo);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public ToDo update(ToDo todo) {
        return repository.save(todo);
    }
}

