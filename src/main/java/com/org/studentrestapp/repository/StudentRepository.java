package com.org.studentrestapp.repository;

import com.org.studentrestapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //public Optional<Student> findByFirstName(String name);
    Optional<Student> findByUniversityNumber(String universityNumber);
    void deleteByUniversityNumber(String universityNumber);
}
