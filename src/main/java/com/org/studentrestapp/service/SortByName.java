package com.org.studentrestapp.service;

import com.org.studentrestapp.entity.Student;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());

    }
}
