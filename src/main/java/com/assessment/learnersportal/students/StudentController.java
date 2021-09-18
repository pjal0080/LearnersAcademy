package com.assessment.learnersportal.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/api/v1/getstudents")
    public List<Student> getStudents(){

        return studentService.getStudentsList();
    }

    @PostMapping(path = "/api/v1/registerstudent")
    public void registerStudent(@RequestBody Student student){

        studentService.registerNewStudent(student);
    }


}
