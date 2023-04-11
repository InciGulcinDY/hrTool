package com.ladinProject.hrTool.entities.concretes;

import javax.persistence.Entity;

import com.ladinProject.hrTool.entities.abstracts.Employee;

@Entity

public class FullTimeEmployee extends Employee {
	

	private int salary;

}
