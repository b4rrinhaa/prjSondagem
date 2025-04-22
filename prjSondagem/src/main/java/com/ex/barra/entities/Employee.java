package com.ex.barra.entities;

import java.util.List;

import org.hibernate.annotations.GenerationTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_Employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomeEmployee;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tb_employee_projects",joinColumns = @JoinColumn(name="employee_id"),inverseJoinColumns = @JoinColumn(name="projects_id"))
	private List<Project> projects;

	public Employee() {
		
	}
	
	public Employee(Long id, String nomeEmployee, List<Project> projects) {
		super();
		this.id = id;
		this.nomeEmployee = nomeEmployee;
		this.projects = projects;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEmployee() {
		return nomeEmployee;
	}

	public void setNomeEmployee(String nomeEmployee) {
		this.nomeEmployee = nomeEmployee;
	}

	public List<Project> getProject() {
		return projects;
	}

	public void setProject(List<Project> projects) {
		this.projects = projects;
	}

	
	
	
	
}