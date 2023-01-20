package com.org.studentrestapp.exceptions;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(String message) {
        super("User entered an invalid first Name or Last Name " + message);
    }
}
