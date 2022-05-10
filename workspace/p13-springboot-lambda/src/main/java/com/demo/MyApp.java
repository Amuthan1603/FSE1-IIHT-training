package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.annotation.PostConstruct;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.demo.model.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApp {

	private List<Book> books = new ArrayList<Book>();
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	
	@PostConstruct
	public void construct() {
		books.add(new Book(15, "Me", "This is my book", 96));
		books.add(new Book(21, "He", "This is his book", 15));
		books.add(new Book(24, "She", "This is her book", 75));
		books.add(new Book(12, "We", "This is our book", 99));
	}

	@Bean
	// without api gateway
	public Supplier<List<Book>> getAllBooks(){

		Supplier<List<Book>> s = ()->{
			return books;
		};

		return s;

	}

	@Bean
	public Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> getFilteredBooks(){
		return (event)->{
			// www.abc.com/demo?booktitle=their book
			String title = event.getQueryStringParameters().get("booktitle");
			System.out.println("Input title is "+title);

			return new APIGatewayProxyResponseEvent()
				.withBody(books.toString())
				.withStatusCode(200);
		};
	}
	
}
