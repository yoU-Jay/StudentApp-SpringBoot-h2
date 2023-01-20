package com.org.studentrestapp.validation;

import com.org.studentrestapp.entity.Student;
import com.org.studentrestapp.exceptions.InvalidInputException;
import com.org.studentrestapp.exceptions.NullInputException;
import org.springframework.cache.support.NullValue;

public class IsNull {
    public static boolean isNull(Student input) {
        try {
            if (input.getFirstName().equals(null)) {
                return true;
            } else if (input.getLastName().equals(null)) {
                return true;
            } else if (input.getDepartmentName().equals(null)) {
                return true;
            } else if (input.getUniversityNumber().equals(null)) {
                return true;
            } else if (input.getPercentage() == null) {
                return true;
            } else if (input.getDateOfBirth() == null) {
                return true;
            } else
                return false;
        } catch (NullPointerException ne){
            throw new NullInputException(input.getId() +" ");
        }
    }
}
