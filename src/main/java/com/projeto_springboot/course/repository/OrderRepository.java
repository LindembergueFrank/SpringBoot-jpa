package com.projeto_springboot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_springboot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	
}
