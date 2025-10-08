package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {

	@Id
	private int d_id;
	private String d_name;
	
	@OneToMany(mappedBy = "doctor")
	List<Patient> patients;
	
	
	public Doctor(int d_id, String d_name, List<Patient> patients) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.patients = patients;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public Doctor(int d_id, String d_name) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [d_id=" + d_id + ", d_name=" + d_name + ", patients=" + patients + "]";
	}
	
	
	
	
}
