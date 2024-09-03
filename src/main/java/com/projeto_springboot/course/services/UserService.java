package com.projeto_springboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_springboot.course.entities.User;
import com.projeto_springboot.course.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> usr = repository.findById(id);
		return usr.get();
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
}
