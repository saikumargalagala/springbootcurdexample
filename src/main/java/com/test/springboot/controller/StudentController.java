package com.test.springboot.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.springboot.model.Student;
import com.test.springboot.service.Studentservice;

@Controller
public class StudentController {
	@Autowired
	private Studentservice service;
	
	@RequestMapping("/studentNewForm")
	public String addNewStudent(Student student) {
		
		return "studentForm";
	}
	
	
	@RequestMapping("/saveStudent")
	public String saveStudent(Student student) {
		
		System.out.println("saveStudent... ");
		
		service.saveStudent(student);
		return "redirect:/listStudent";
	}
	@RequestMapping("/listStudent")
	public ModelAndView getAllStudent(ModelAndView model) {
		System.out.println("list all students");
		 List<Student> listStudent =service.getAllStudent();
		 System.out.println("listStudent...."+listStudent.size());
		 model.addObject("listStudent", listStudent);
		 model.setViewName("home");
		 
      return model;
}
	@RequestMapping("/deleteStudent")
	public String deleteStudent(HttpServletRequest request) {
		int studentid=Integer.parseInt(request.getParameter("id"));
		service.deleteStudent(studentid);
		return "redirect:/listStudent";
		
	}
	
	@RequestMapping("/editStudent")
	public ModelAndView editStudent(HttpServletRequest request) {
		int studentid=Integer.parseInt(request.getParameter("id"));
		Optional<Student> student=service.getByStudentId(studentid);
		ModelAndView model=new ModelAndView("studentForm");
		model.addObject("student", student);
		return model;
	}
}
