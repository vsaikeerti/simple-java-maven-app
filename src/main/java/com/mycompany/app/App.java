package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = " helle worked Hello World! this is from COMAKEIT";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
