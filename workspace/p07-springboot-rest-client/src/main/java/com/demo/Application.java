package com.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Book;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		getAllBooks();
		
//		saveBook();
		
	}
	
	private static void getAllBooks() {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:9090/books";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "application/json");
		HttpEntity<Book> entity = new HttpEntity<Book>(headers);
		
		ResponseEntity<List<Book>> res = template.exchange(
				url, 
				HttpMethod.GET, 
				entity, 
				new ParameterizedTypeReference<List<Book>>() {}
			);
		
		System.out.println(res.getHeaders());
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody());
		System.out.println(res.getBody().size());
	}
	

	private static void saveBook() {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:9090/books";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "application/json");
		HttpEntity<Book> entity = new HttpEntity<Book>(new Book("ABC", "Abcdefghijklmnop", 1.1), headers);
		
		ResponseEntity<Book> res = template.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<Book>() {});
		
		System.out.println(res.getHeaders());
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody());
	}

}
