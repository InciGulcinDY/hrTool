package com.ladinProject.hrTool.entities.abstracts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.ladinProject.hrTool.entities.concretes.Title;

@Entity
@Table(name = "employee_title")
public class EmployeeTitle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeTitleId;
	
	@ManyToOne
	@MapsId("employeeId")
	private Employee employee;
	
	@ManyToOne
	@MapsId("titleId")
	private Title title;

}

