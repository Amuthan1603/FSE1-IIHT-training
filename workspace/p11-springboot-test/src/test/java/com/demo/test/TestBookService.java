package com.demo.test;

// import static org.mockito.Mockito.when;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import com.demo.entities.Book;
import com.demo.repositories.BookRepository;
import com.demo.services.BookService;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class TestBookService {

    @Autowired
	BookService service;

    @MockBean
	BookRepository repository;


    @Test
    public void getAllBooks(){
        // using actual repository
        List<Book> books = service.getAllBooks();
        System.out.println("in test");
        System.out.println(books);
        System.out.println(books.size());
    }

    @Test
    public void mock_getAllBooks(){

        List<Book> list = new ArrayList<Book>();
        list.add(new Book("Me", "This is my book", 99));
        list.add(new Book("We", "This is our book", 99));
        Mockito.when(repository.findAll()).thenReturn(list);

        // using actual repository
        List<Book> books = service.getAllBooks();
        System.out.println(books);
        System.out.println(books.size());
    }
    
}