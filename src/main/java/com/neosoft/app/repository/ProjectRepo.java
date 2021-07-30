package com.neosoft.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.app.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
