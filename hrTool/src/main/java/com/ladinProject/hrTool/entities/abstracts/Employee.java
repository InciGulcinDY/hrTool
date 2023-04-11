package com.ladinProject.hrTool.entities.abstracts;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.ladinProject.hrTool.entities.concretes.Title;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;

	private int companyId;

	private String firstName;

	private String lastName;

	private String email;

	private int birthyear;

	private int age;

	private int hireyear;

	@ManyToMany
	@JoinTable(name = "employee_title", joinColumns = {
			@JoinColumn(referencedColumnName = "employee_id") }, inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "title_id") })
	private Set<Title> titles;

	private int bonus;

	private int tax;


}
