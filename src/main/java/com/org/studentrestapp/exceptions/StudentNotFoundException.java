package com.org.studentrestapp.exceptions;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(Long id){
        super("Could not find student " + id);
    }
    public StudentNotFoundException(String universityNumber){
        super("Could not find uniNum " + universityNumber);
    }
}
