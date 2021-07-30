package com.neosoft.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	@NotBlank(message = "Student FirstName is Missing")
	@Size(max = 16)
	private String student_firstName;
	@NotBlank(message = "Student LastName is Missing")
	private String student_lastName;
	@NotBlank(message = "Student EmailAddress is Missing")
	private String student_email;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "join_student_project", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	private Set<Project> projects = new HashSet<Project>();

}
