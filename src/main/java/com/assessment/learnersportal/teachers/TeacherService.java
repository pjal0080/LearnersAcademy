package com.assessment.learnersportal.teachers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    public List<Teacher> getTeachersList(){

        return teacherRepository.findAll();
    }

    public void registerNewTeacher(Teacher teacher){

        teacherRepository.save(teacher);
    }


}
