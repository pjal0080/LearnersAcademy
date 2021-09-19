package com.assessment.learnersportal.admin;

import com.assessment.learnersportal.classes.Classes;
import com.assessment.learnersportal.classes.ClassesService;
import com.assessment.learnersportal.students.Student;
import com.assessment.learnersportal.students.StudentService;
import com.assessment.learnersportal.teachers.Teacher;
import com.assessment.learnersportal.teachers.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final TeacherService teacherService;
    private final StudentService studentService;
    private final ClassesService classesService;

    @Autowired
    public AdminController(TeacherService teacherService, StudentService studentService, ClassesService classesService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
        this.classesService = classesService;
    }

    @RequestMapping(path = "/dashboard")
    public String adminDashboard(){

        return "admin_dashboard";

    }

    @RequestMapping(path = "/dashboard/teachers")
    public String listTeachers(Model model){

        List<Teacher> teachers = teacherService.getTeachersList();

        model.addAttribute("teachers",teachers);
        return "teachers";

    }

    @RequestMapping(path = "/dashboard/students")
    public String listStudents(Model model){

        List<Student> students = studentService.getStudentsList();

        model.addAttribute("students",students);
        return "students";

    }


    @RequestMapping(path = "/dashboard/subjects")
    public String listSubjects(Model model){

        List<Classes> subjects = classesService.getClassList();

        model.addAttribute("subjects",subjects);
        return "subjects";

    }


    @RequestMapping(path = "/dashboard/classes")
    public String listClasses(Model model){

        List<Classes> classes = classesService.getClassList();

        model.addAttribute("classes",classes);
        return "classes";

    }



}
