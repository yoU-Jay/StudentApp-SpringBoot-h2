package com.org.studentrestapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class InvalidInputAdvice {
    @ResponseBody
    @ExceptionHandler(InvalidInputException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String invalidInputHandler(InvalidInputException iie){
        return iie.getMessage();
    }
}