package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

// opcionalmente poderia colocar o @Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
