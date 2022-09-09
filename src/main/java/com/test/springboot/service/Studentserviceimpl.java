package com.test.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springboot.dao.StudentDao;
import com.test.springboot.model.Student;
@Transactional
@Service
public class Studentserviceimpl implements Studentservice{
	
	@Autowired
	private StudentDao repo;

	@Override
	public void saveStudent(Student student) {
		repo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Student> getByStudentId(int id) {
		
		return repo.findById(id);
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
		
	}
	
	@Override
	public void editStudent(int id) {
		repo.findById(id);
	}
	
	
}

	

	
		
	



	
	


