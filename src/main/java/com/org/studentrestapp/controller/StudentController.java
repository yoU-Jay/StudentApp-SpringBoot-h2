package com.org.studentrestapp.controller;

import com.org.studentrestapp.exceptions.InvalidInputException;
import com.org.studentrestapp.exceptions.StudentNotFoundException;
import com.org.studentrestapp.entity.Student;
import com.org.studentrestapp.repository.StudentRepository;
import com.org.studentrestapp.service.SortByDepartment;
import com.org.studentrestapp.service.SortByName;
import com.org.studentrestapp.service.SortByPercentage;
import com.org.studentrestapp.validation.IsNull;
import com.org.studentrestapp.validation.ValidateInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;


@RestController
public class StudentController {
    @Autowired
    public StudentRepository repository;

    //public List<Student> students;
/*    StudentController(StudentRepository repository) {
        this.repository = repository;
    }*/

    //Returns all the students(no sorting)
    @GetMapping("/students")
    public List<Student> all() {
        return repository.findAll();
    }
    //Returns Students (by Name (ascending))
    @GetMapping("/students/sortbyname")
    public List<Student> nameSorting() {
        List<Student> sortByName = repository.findAll();
        Collections.sort(sortByName, new SortByName());
        return sortByName;
    }
    //Returns Students (by Department (ascending))
    @GetMapping("/students/sortbydept")
    public List<Student> departmentSorting() {
        List<Student> sortByDept = repository.findAll();
        Collections.sort(sortByDept, new SortByDepartment());
        return sortByDept;
    }
    //Returns Students (by percentage (ascending))
    @GetMapping("/students/sortbypercentage")
    public List<Student> percentageSorting() {
        List<Student> sortByPercentage = repository.findAll();
        Collections.sort(sortByPercentage, new SortByPercentage());
        return sortByPercentage;
    }
    //Returns Student by universityNumber
    @GetMapping("/students/{universityNumber}")
    public Student student(@PathVariable String universityNumber){
        return repository.findByUniversityNumber(universityNumber).orElseThrow(() -> new StudentNotFoundException(universityNumber));

    }
    //Delete student by university number
    @DeleteMapping("/students/{universityNumber}")
    String deleteByStudent(@PathVariable String universityNumber){
        repository.deleteByUniversityNumber(universityNumber);
        return "Deleted" + universityNumber;
    }

    //Add a new student
    @PostMapping("/students")
    public Student newStudent(@RequestBody Student newStudent) {
        IsNull.isNull(newStudent);
        if((ValidateInputs.isAlphabetsOnly(newStudent.getFirstName()) == false || ValidateInputs.isAlphabetsOnly(newStudent.getLastName()) == false)){
            throw new InvalidInputException(newStudent.getFirstName());
        }
        return repository.save(newStudent);
    }

/*    //Update student details
    @PutMapping("/students/{universityNumber}")
    public Student replaceStudent(@RequestBody Student newStudent, @PathVariable String universityNumber) {
        return repository.findByUniversityNumber(universityNumber)
                .map(student -> {
                    student.setFirstName(newStudent.getFirstName());
                    student.setLastName(newStudent.getLastName());
                    return repository.save(student);
                })
                .orElseGet(() -> {
                    newStudent.setId(id);
                    return repository.save(newStudent);
                });
    }*/

}











/*
    @GetMapping("/students/{id}")
    public EntityModel<Student> one(@PathVariable Long id) {
        Student student = repository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
        return EntityModel.of(student,
                linkTo(methodOn(StudentController.class).one(id)).withSelfRel(),
                linkTo(methodOn(StudentController.class).all()).withRel("students"));
    }
*/

/*
    @DeleteMapping("/studen/{id}")
    String deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
        return "Deleted" + id;
    }
*/

