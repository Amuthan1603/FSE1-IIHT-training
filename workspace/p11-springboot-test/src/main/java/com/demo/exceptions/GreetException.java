package com.demo.exceptions;

public class GreetException extends Exception {
    
    public GreetException(){
        super();
    }
    public GreetException(String m){
        super(m);
    }
    public GreetException(Exception e){
        super(e);
    }
    public GreetException(String m, Exception e){
        super(m, e);
    }


}