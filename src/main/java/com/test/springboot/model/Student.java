package com.test.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student_101")
@Data
public class Student {
	@Id
	private int id;
	private String name;
	private String branch;
	private int rollnum;
	private String address;
	
}
