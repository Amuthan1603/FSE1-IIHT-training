package com.demo;

import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class DemoClass {
    
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        String ecodedString = encoder.encode("demo@123");

        System.out.println("EcodedString: "+ecodedString);
        System.out.println(encoder.matches("demo@123", ecodedString));
        System.out.println(encoder.matches("demo@1234", ecodedString));
        System.out.println(encoder.matches("demo@321", ecodedString));
        System.out.println(encoder.matches("demo", ecodedString));
    }
}