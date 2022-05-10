package com.demo.contollers;
// com.demo

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Book;
import com.demo.exception.BookNotFoundException;
import com.demo.services.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
	@GetMapping("/demo")
	public String testMe() {
		return "app is running";
	}
	

	@GetMapping(value="/books", produces= {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
		}, consumes= {
				MediaType.APPLICATION_XML_VALUE,
				MediaType.APPLICATION_JSON_VALUE
			})
	public List<Book> getAllBooks(){
		return service.getAllBooks(); 
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id) throws BookNotFoundException{
		System.out.println("Id : "+id);
		return service.getBookById(id);
	}
	
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book) {
		System.out.println("Book to save: "+book);
		// save in db
		return service.saveBook(book);
	}
	
	@PutMapping("/books/{id}")
	public Book modifyBook(@PathVariable int id, @RequestBody Book book) {
		System.out.println("Book to find: "+id);
		System.out.println("Book to update: "+book);
		return service.modifyBook(id, book);
	}
	
	@DeleteMapping("/books/{id}")
	public boolean removeBook(@PathVariable int id) {
		System.out.println("Book to delete: "+id);
		return service.removeBook(id);
	}
	
	
}
