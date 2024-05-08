package com.example.springdemo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Franz",
                        "franz@test.com",
                        LocalDate.of(1999, Month.APRIL, 1),
                        25
                )
        );
    }
}
