package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.api.MessageConvertor;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@Autowired
	MessageConvertor convertor;
	
	@Override
	public void run(String... args) throws Exception {
		convertor.translate("This is consumer app");
	}

}
