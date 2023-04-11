package com.ladinProject.hrTool.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ladinProject.hrTool.entities.concretes.FullTimeEmployee;

public interface FullTimeEmployeeRepository extends JpaRepository<FullTimeEmployee, Integer>{

}
