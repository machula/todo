package com.machula.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.machula.bank.entity.Todo;
import com.machula.bank.repository.TodoRepository;

@Service
public class TodoService {

	private final TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}
	
	public List<Todo> findAll(){
		return this.todoRepository.findAll();
	}
}
