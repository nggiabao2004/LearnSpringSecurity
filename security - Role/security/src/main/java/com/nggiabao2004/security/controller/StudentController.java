package com.nggiabao2004.security.controller;


import com.nggiabao2004.security.entity.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private final List<Students> students = new ArrayList<>(
            List.of(
                    new Students(1, "Navin", 60),
                    new Students(2, "Kiran", 65)
            )
    );

    @GetMapping("/students")
    public List<Students> getStudents(){
        return students;
    }

    @PostMapping("/students")
    public Students addStudent(@RequestBody Students student){
        students.add(student);
        return student;
    }
}
