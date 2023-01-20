package com.org.studentrestapp.exceptions;

public class NullInputException extends RuntimeException{
    public NullInputException(String message) {
        super("User entered a null value" + message);
    }
}
