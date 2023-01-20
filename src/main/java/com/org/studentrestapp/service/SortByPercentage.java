package com.org.studentrestapp.service;

import com.org.studentrestapp.entity.Student;

import java.util.Comparator;

public class SortByPercentage implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getPercentage().compareTo(s2.getPercentage());

    }
}
