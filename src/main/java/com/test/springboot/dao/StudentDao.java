package com.test.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.springboot.model.Student;

@Repository
public interface StudentDao  extends JpaRepository<Student, Integer>{

}
