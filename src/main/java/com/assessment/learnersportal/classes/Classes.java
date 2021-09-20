package com.assessment.learnersportal.classes;

import com.assessment.learnersportal.students.Student;
import com.assessment.learnersportal.teachers.Teacher;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long id;

    @Column(unique = true)
    private String subject;

    @Column(name = "class_timings")
    private String classTimings;

    @OneToMany(mappedBy = "classes",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Student> students;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "teacher_id",nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Teacher teachers;


    public Classes(){

    }

    public Teacher getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }

    public Classes(Long id, String subject, String classTimings, Teacher teachers) {
        this.id = id;
        this.subject = subject;
        this.classTimings = classTimings;
        this.teachers = teachers;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassTimings() {
        return classTimings;
    }

    public void setClassTimings(String classTimings) {
        this.classTimings = classTimings;
    }


}
