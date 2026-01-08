package com.ptech.todo.service;

import java.util.List;

import com.ptech.todo.dto.request.TodoRequest;
import com.ptech.todo.dto.response.TodoResponse;

public interface ITodoService {

	TodoResponse createTodo(TodoRequest request);

	List<TodoResponse> getAllTodos();

	TodoResponse getTodoById(Long id);

	TodoResponse updateTodo(Long id, TodoRequest request);

	void deleteTodoById(Long id);

}
