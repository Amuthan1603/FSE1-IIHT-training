package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {//implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Autowired
//	private MessageConvertor messageConvertor;
//
//	@Override
//	public void run(String... args) throws Exception {
//		messageConvertor.translate("Welcome user");
//	}

	
}
