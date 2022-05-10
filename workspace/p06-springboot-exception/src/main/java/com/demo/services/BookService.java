package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.entities.Book;
import com.demo.exception.BookNotFoundException;
import com.demo.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository repository;

	public List<Book> getAllBooks(){
		return repository.findAll(); 
	}
	
	public ResponseEntity<Book> getBookById(int id) throws BookNotFoundException{
		Optional<Book> optional = repository.findById(id); 
		
		if(optional.isPresent()) {
			return new ResponseEntity<Book>(optional.get(), HttpStatus.OK);
		} else {
			// book is not found
			System.out.println("book not found with id: "+id);
//			return new ResponseEntity<Book>(HttpStatus.OK);
			throw new BookNotFoundException("book not found with id: "+id);
		}

	}
	
	public Book saveBook(Book book) {
		return repository.save(book);
	}

	public Book modifyBook(int id, Book book) {
		if(repository.existsById(id)) {
			book.setId(id);
			return repository.save(book);
		} else {
			// book is not found
			System.out.println("book not found with id: "+id);
			System.out.println("Nothing to update");
			return null;
		}
	}
	
	public boolean removeBook(int id) {
		repository.deleteById(id);
		return true;
	}
	
}
