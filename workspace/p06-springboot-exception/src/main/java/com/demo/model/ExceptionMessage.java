package com.demo.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ExceptionMessage {

	private String message;
	private LocalDateTime dt;
	private HttpStatus status;
	
	private SomeOtherModel som;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDt() {
		return dt;
	}
	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	public void setSom(SomeOtherModel som) {
		this.som = som;
	}
	public SomeOtherModel getSom() {
		return som;
	}
	
	public ExceptionMessage(String message, HttpStatus status) {
		super();
		this.message = message;
		this.dt = LocalDateTime.now();
		this.status = status;
	}
	public ExceptionMessage(String message, HttpStatus status, SomeOtherModel som) {
		super();
		this.message = message;
		this.dt = LocalDateTime.now();
		this.status = status;
		this.som = som;
	}
	@Override
	public String toString() {
		return "ExceptionMessage [message=" + message + ", dt=" + dt + ", status=" + status + ", som=" + som + "]";
	}
	
	
	
}
