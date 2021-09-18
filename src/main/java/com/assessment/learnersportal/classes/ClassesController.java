package com.assessment.learnersportal.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassesController {

    private final ClassesService classesService;

    @Autowired
    public ClassesController(ClassesService classesService) {
        this.classesService = classesService;
    }

    @GetMapping(path = "/api/v1/getclasses")
    public List<Classes> getClasses(){

        return classesService.getClassList();

    }


    @PostMapping(path = "/api/v1/registerclass")
    public void registerClass(@RequestBody Classes newClass){

        classesService.registerNewClass(newClass);
    }


}
