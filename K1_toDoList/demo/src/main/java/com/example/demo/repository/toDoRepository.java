package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ToDo;

public interface toDoRepository extends JpaRepository <ToDo, Integer> {

}
