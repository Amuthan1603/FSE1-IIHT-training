package com.demo.utils;

import com.demo.exceptions.GreetException;

public class Greeting {
    
    public String greet(String name) throws GreetException{
        try{
            name = (name.charAt(0)+"").toUpperCase() + 
            name.substring(1).toLowerCase();
            return "Welcome "+name;
        } catch (StringIndexOutOfBoundsException e){
            throw new GreetException("name can not be empty", e);
        } catch(NullPointerException e){
            throw new GreetException("name can not be null", e);
        }
        
    }

}