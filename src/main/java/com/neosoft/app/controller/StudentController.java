package com.neosoft.app.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.app.entity.Project;
import com.neosoft.app.entity.Student;
import com.neosoft.app.repository.ProjectRepo;
import com.neosoft.app.service.ProjectService;
import com.neosoft.app.service.StudentService;

@RestController
@RequestMapping("/api/auth")
public class StudentController {
	@Autowired
	private StudentService ser;
	@Autowired
	private ProjectService proser;
	@Autowired
	private ProjectRepo repo;

	@GetMapping("/student/{id}")
	public ResponseEntity<Student> findStudentById(@PathVariable int id) {
		Student studentById = ser.getStudentById(id);
		if (studentById == null) {
			System.out.println("Student not found");
		}
		return new ResponseEntity<Student>(studentById, HttpStatus.OK);
	}

	@PostMapping("/addstudent")
	public ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
		Project pro = new Project();
		pro.setStudent(student);

		ser.saveStudent(student);
		return new ResponseEntity<String>("record saved successfully", HttpStatus.CREATED);
	}

	@GetMapping("/GetAllStudents")
	public ResponseEntity<List<Student>> getAllStudents() {

		List<Student> student = ser.getALlStudents();
		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}

}
