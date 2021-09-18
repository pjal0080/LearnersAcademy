package com.assessment.learnersportal.classes;

import com.assessment.learnersportal.students.Student;

import javax.persistence.*;
import java.io.Serializable;
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

    public Classes(){

    }

    public Classes(String subject, String classTimings) {
        this.subject = subject;
        this.classTimings = classTimings;
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

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", classTimings='" + classTimings + '\'' +
                '}';
    }
}
