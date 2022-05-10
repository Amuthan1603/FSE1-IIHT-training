package com.demo.contollers;
// com.demo

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import com.demo.entities.Book;
import com.demo.services.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookService service;
	
	@GetMapping("/demo")
	public String testMe() {
		return "app is running";
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return service.getAllBooks(); 
	}
	


	@ApiOperation(
		value="Find book by id",
		notes="Provide positive number as id",
		response = Book.class
		)

	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable int id){
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
