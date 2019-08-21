package com.machula.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machula.bank.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
