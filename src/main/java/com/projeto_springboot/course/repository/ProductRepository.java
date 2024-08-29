package com.projeto_springboot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_springboot.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
