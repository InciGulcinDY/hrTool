package com.ladinProject.hrTool.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ladinProject.hrTool.entities.concretes.PartTimeEmployee;

public interface PartTimeEmployeeRepository extends JpaRepository<PartTimeEmployee, Integer>{

}
