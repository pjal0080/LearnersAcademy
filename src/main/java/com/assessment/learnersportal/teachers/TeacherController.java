package com.assessment.learnersportal.teachers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping(path = "/api/v1/getteachers")
    public List<Teacher> getTeachers(){

        return teacherService.getTeachersList();
    }

    @PostMapping(path = "/api/v1/registerteacher")
    public void registerTeacher(@RequestBody Teacher teacher){

        teacherService.registerNewTeacher(teacher);
    }


}
