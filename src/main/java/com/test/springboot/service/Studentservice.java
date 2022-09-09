package com.test.springboot.service;

import java.util.List;
import java.util.Optional;

import com.test.springboot.model.Student;

public interface Studentservice {
	
	public void saveStudent(Student student);
	public List<Student> getAllStudent();
	public Optional<Student> getByStudentId(int id);
	public void deleteStudent(int id);
	public void editStudent(int id);

}
