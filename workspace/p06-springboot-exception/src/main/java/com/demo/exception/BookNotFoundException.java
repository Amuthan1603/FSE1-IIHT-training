package com.demo.exception;

public class BookNotFoundException extends Exception {

	public BookNotFoundException() {}
	public BookNotFoundException(String m) {
		super(m);
	}
	public BookNotFoundException(Exception e) {
		super(e);
	}
	public BookNotFoundException(String m, Exception e) {
		super(m, e);
	}
	
}
