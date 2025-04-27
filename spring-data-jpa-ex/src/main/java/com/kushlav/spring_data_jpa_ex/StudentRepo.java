package com.kushlav.spring_data_jpa_ex;

import com.kushlav.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    Some times jpa creates some queries behind the scenes
    @Query("Select s from Student s where s.Name = ?1")
    List<Student> findByName(String name);
    List<Student> findByMarksGreaterThan(int marks);
}
