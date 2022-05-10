package com.demo.contollers;
// com.demo

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Book;
import com.demo.services.BookService;

@RestController
@CrossOrigin//(origins = {"https://hoppscotch.io"})
public class BookController {

	@Autowired
	BookService service;
	
	@GetMapping("/demo")
	public String testMe() {
		return "app is running";
	}
	
	@GetMapping("/books")
	@Cacheable(value = "books")
	public List<Book> getAllBooks(){
		System.out.println("Finding books from db.."+Math.random());
		return service.getAllBooks(); 
	}
	
	@GetMapping("/books/{id}")
	@Cacheable(key="#id", value = "books")
	public Book getBookById(@PathVariable int id){
		System.out.println("Find book with Id : "+id);
		return service.getBookById(id); 
	}
	
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book) {
		System.out.println("Creating book: "+book);
		// save in db
		return service.saveBook(book);
	}
	
	@PutMapping("/books/{id}")
	@CacheEvict(key="#id", value = "books")
	public Book modifyBook(@PathVariable int id, @RequestBody Book book) {
		System.out.println("Book to find: "+id);
		System.out.println("Book to update: "+book);
		return service.modifyBook(id, book);
	}
	
	@DeleteMapping("/books/{id}")
	@CacheEvict(key="#id", value = "books")
	public boolean removeBook(@PathVariable int id) {
		System.out.println("Book to delete: "+id);
		return service.removeBook(id);
	}
	
	
}
