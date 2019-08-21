package com.machula.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.machula.bank.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> , CrudRepository<User, Integer>{
	
	User findByUsername(String username);

}
