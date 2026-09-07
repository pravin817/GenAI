package com.ptech.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptech.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
