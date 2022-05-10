package com.demo.contollers.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exception.BookNotFoundException;
import com.demo.model.ExceptionMessage;
import com.demo.model.SomeOtherModel;

@ControllerAdvice
public class MyControllerAdvice {

	// message1 = this is message 1
	// message2 = this is message 2

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ExceptionMessage> handleException(BookNotFoundException e) {
//		return new ResponseEntity<ExceptionMessage>(new ExceptionMessage(e.getMessage(), HttpStatus.NO_CONTENT), HttpStatus.OK);
		ExceptionMessage obj = new ExceptionMessage(e.getMessage(), HttpStatus.NO_CONTENT, new SomeOtherModel(96321));
		System.out.println("++++++++++++");
		System.out.println("++++++++++++");
		System.out.println("++++++++++++");
		System.out.println("++++++++++++");
		System.out.println("++++++++++++");
		System.out.println(obj);
		return new ResponseEntity<ExceptionMessage>(obj, HttpStatus.OK);
	}

//	@ExceptionHandler(MyOtherException.class)
//	public ResponseEntity<ExceptionMessage> handle2Exception(MyOtherException e){
//		return new ResponseEntity<ExceptionMessage>(new ExceptionMessage(e.getMessage(), HttpStatus.NO_CONTENT), HttpStatus.OK);
//	}

}
