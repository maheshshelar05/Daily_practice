package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int p_id;
	private String p_name;

	@ManyToMany(mappedBy = "projects")
	List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	

	

	@Override
	public String toString() {
		return "Project [p_id=" + p_id + ", p_name=" + p_name + ", employees=" + employees + "]";
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
