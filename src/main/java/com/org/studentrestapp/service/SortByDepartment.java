package com.org.studentrestapp.service;

import com.org.studentrestapp.entity.Student;

import java.util.Comparator;

public class SortByDepartment implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getDepartmentName().compareTo(s2.getDepartmentName());
    }
}
