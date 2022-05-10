package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Book;

//@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
// findAll - Book, Movie, Item, Employee
	
	// findById -> id is stirng, int, double
}
