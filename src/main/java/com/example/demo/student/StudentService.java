package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Aditya",
                        21,
                        LocalDate.of(2003, Month.AUGUST, 29),
                        "adityareddy02468@gmail.com"
                )
        );
    }
}
