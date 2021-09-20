package com.assessment.learnersportal.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudentsList(){

        return studentRepository.findAll();

    }

    public void registerNewStudent(Student student){

        studentRepository.save(student);

    }


    public List<Student> getStudentsByClass(Long id){

        return studentRepository.getStudentsByClassId(id);
    }


}
