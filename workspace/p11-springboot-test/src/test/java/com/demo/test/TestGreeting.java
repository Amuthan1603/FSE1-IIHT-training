package com.demo.test;

import com.demo.exceptions.GreetException;
import com.demo.utils.Greeting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGreeting {

    Greeting g;

    @BeforeEach
    public void beforeEachTestCase(){
        g = new Greeting();
    }

    @AfterEach
    public void afterEachTestCase(){
        g = null;
    }

    
    @Test
    public void greetShouldGreet() throws GreetException{
        // Greeting g = new Greeting();
        String name = "aRuN";

        String result = g.greet(name);

        // if("Welcome Arun".equals(result)){
        //     System.out.println("valid");
        // } else {
        //     System.out.println("Test case failed");
        // }

        Assertions.assertEquals("Welcome Arun", result);
    }

    
    @Test
    public void shouldNotGreetWithEmptyName() throws GreetException{

        Assertions.assertThrows(GreetException.class, ()->{
            // Greeting g = new Greeting();
            String name = "";
    
            g.greet(name);
        });

    }

    @Test
    public void shouldNotGreetWithNull() throws GreetException{

        Assertions.assertThrows(GreetException.class, ()->{
            // Greeting g = new Greeting();
            String name = null;
    
            g.greet(name);
        });

    }

    @Test
    public void junitTestDemo(){
        Assertions.assertNotNull(new String());
        Assertions.assertTrue(true);
        // Assertions.assertTrue(obj==obj2);
    }

}