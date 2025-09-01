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

    public ToDo update(Integer id, ToDo updatedTodo) {
        return repository.findById(id)
                .map(todo -> {
                    todo.setTitle(updatedTodo.getTitle());
                    todo.setDescription(updatedTodo.getDescription());
                    todo.setStartDateTime(updatedTodo.getStartDateTime());
                    todo.setEndDateTime(updatedTodo.getEndDateTime());
                    todo.setDone(updatedTodo.isDone());
                    return repository.save(todo);
                })
                .orElse(null);
    }

    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

