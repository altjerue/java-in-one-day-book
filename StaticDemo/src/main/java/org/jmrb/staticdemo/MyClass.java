package org.jmrb.staticdemo;

public class MyClass {
    //Non-static field and method
    public String message = "Hello World";

    public void displayMessage() {
        System.out.println("Message = " + message);
    }

    //Static field and method
    public static String greetings = "Good morning";

    public static void displayGreetings() {
        System.out.println("Greetings = " + greetings);
    }

    /*
    The main difference between static and non-static fields/methods is that one
    can call the former ones without instantiating an object of their class.
     */
}
