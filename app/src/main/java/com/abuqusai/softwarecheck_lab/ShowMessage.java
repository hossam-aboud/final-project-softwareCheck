package com.abuqusai.softwarecheck_lab;

public class ShowMessage {
    private String message;

    //Setting value to the message property using ShowMessage() constructor
    public ShowMessage(String message) {
        this.message = message;
    }

    // Creating show() method for showing message to the user
    public void show() {
        //Showing message
        System.out.println(message);
        //Generating divide by zero exception
        int a = 0;
        int b = 1 / a;
    }

    // Concatenate message with the Hello! string
    public String finalMessage() {
        String msg = "Hello!" + message;
        System.out.println(msg);
        return msg;
    }
}
