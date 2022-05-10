package com;

@FunctionalInterface // SAM
interface Greeting{
    public String hello(String name);
    public String toString();
}

// interface MyInterface<T, V>{
//     public V doTask(T t);
// }

// class GreetingImpl implements Greeting{

//     @Override
//     public String greet(String name) {
//         return "Welcome "+name;
//     }
    
// }

public class JavaLambdaDemo {

    private static void greetUser(Greeting g, String name){
        String r = g.hello(name);
        System.out.println(r);
    }

    public static void main(String[] args) {
        // Greeting g = new Greeting(){

        //     @Override
        //     public String greet(String name) {
        //         return "Welcome "+name;
        //     }
            
        // };

        Greeting g =  (name)-> {
            return "Welcome "+name;
        };

        greetUser(g, "cts");

    }
}