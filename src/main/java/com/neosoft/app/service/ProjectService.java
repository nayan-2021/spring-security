package com.neosoft.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.app.entity.Project;
import com.neosoft.app.entity.Student;
import com.neosoft.app.repository.ProjectRepo;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepo repo;

	public String saveProject(Project project) {

		return null;
	}

	public Student getProjectById(Integer id) {
		return null;
	}

	public List<Project> getALlProjects() {
		return repo.findAll();
	}

}
