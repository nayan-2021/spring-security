package com.neosoft.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.app.entity.Student;
import com.neosoft.app.repository.ProjectRepo;
import com.neosoft.app.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	@Autowired
	private ProjectRepo rep;

	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	public List<Student> getALlStudents() {
		return repo.findAll();

	}

	public Student getStudentById(Integer id) {

		Optional<Student> findById = repo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		} else
			return null;
	}

}
