package com.assessment.learnersportal.students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query(value = "SELECT * FROM students WHERE class_id =:id", nativeQuery = true)
    public List<Student> getStudentsByClassId(@Param("id") Long id);

}
