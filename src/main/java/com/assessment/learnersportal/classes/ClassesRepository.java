package com.assessment.learnersportal.classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesRepository extends JpaRepository<Classes,Long> {

    @Query(value = "SELECT * FROM classes WHERE classes.teacher_id =:id",nativeQuery = true)
    List<Classes> getClassesByTeacherId(@Param("id") Long id);

}
