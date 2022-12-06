package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World! this is from COMAKEIT, this si an new line added ";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
