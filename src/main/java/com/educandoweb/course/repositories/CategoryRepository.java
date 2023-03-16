package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

// opcionalmente poderia colocar o @Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
