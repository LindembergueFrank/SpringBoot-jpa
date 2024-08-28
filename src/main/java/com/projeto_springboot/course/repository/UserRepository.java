package com.projeto_springboot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_springboot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
