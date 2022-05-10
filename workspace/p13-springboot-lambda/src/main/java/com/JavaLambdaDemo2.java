package com;

import java.util.function.Function;

public class JavaLambdaDemo2 {

    private static void greetUser(Function<String, String> g, String name){
        String r = g.apply(name);
        System.out.println(r);
    }

    public static void main(String[] args) {

        Function<String, String> g =  (name)-> {
            return "Welcome "+name;
        };

        greetUser(g, "cts");

    }
}