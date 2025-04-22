package com.ex.barra.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_projects")

public class Project{ 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomeProjects;
	
	@ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY)
	private List<Employee> employees;
	
	public Project(Long id, String nomeProject, List<Employee> employees) {
		super();
		this.id = id;
		this.nomeProjects = nomeProjects;
		this.employees = employees;
	}

	public Project() {
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProjects() {
		return nomeProjects;
	}

	public void setNomeProjects(String nomeProjects) {
		this.nomeProjects = nomeProjects;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	

}
