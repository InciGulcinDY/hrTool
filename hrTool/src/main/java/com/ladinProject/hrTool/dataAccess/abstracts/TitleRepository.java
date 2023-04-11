package com.ladinProject.hrTool.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ladinProject.hrTool.entities.concretes.Title;

public interface TitleRepository extends JpaRepository<Title, Integer>{

}
