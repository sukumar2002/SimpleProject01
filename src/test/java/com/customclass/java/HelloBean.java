package com.customclass.java;

public class HelloBean {
    private String message;

    public HelloBean() {
        this.message = "Hi Sukumar"; // Initialize default message
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message; // Ensure this returns the message
    }
}
