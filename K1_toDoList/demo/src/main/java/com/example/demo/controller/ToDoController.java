package com.example.demo.controller;

import com.example.demo.entity.ToDo;
import com.example.demo.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {

    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ToDo> getAllTodos() {
        return service.getAll();
    }

    @PostMapping
    public ToDo createTodo(@RequestBody ToDo todo) {
        return service.create(todo);
    }

    @PutMapping
    public ToDo updateTodo(@RequestBody ToDo todo) {
        return service.update(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable int id) {
        service.delete(id);
    }
}

    



