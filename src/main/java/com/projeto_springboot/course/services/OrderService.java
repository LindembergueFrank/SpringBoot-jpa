package com.projeto_springboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_springboot.course.entities.Order;
import com.projeto_springboot.course.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Integer id) {
		Optional<Order> usr = repository.findById(id);
		return usr.get();
	}
}
