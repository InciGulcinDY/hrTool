package com.ladinProject.hrTool.entities.concretes;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.ladinProject.hrTool.entities.abstracts.Employee;

@Entity

public class Title {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "title_id")
	private int titleId;
	
	private String title;
	
	@ManyToMany(mappedBy = "titles")
	private Set<Employee> employees;

}
