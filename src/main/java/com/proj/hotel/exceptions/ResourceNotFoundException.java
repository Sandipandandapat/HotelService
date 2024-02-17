package com.proj.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);       // here we are passing message to parent class
    }

    public ResourceNotFoundException(){    //if this exception is called without a message then we can give message manually
        super("Resource not found!!");
    }
}
