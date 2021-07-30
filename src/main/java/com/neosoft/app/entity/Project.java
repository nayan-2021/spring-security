package com.neosoft.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Project")
@NoArgsConstructor
@AllArgsConstructor

public class Project {
	@Id
	private Integer projectId;
	private String projectName;
	private int duaration_in_months;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
}