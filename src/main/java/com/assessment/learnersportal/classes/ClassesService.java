package com.assessment.learnersportal.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {

    private final ClassesRepository classesRepository;

    @Autowired
    public ClassesService(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }


    public List<Classes> getClassList(){

        return classesRepository.findAll();
    }


    public void registerNewClass(Classes newClass) {

        classesRepository.save(newClass);
    }


    public List<Classes> getClassesByTeacher(Long id){

        return classesRepository.getClassesByTeacherId(id);

    }


}
