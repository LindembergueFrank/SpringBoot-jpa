package com.projeto_springboot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_springboot.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
