package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Patient {
	@Id
	private int p_id;
	private String p_name;
	private String p_diases;
	
	@JoinColumn(name="Doctor_id")
	@ManyToOne
	Doctor doctor;
	


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(int p_id, String p_name, String p_diases, Doctor doctor) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_diases = p_diases;
		this.doctor = doctor;
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


	public String getP_diases() {
		return p_diases;
	}


	public void setP_diases(String p_diases) {
		this.p_diases = p_diases;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	@Override
	public String toString() {
		return "Patient [p_id=" + p_id + ", p_name=" + p_name + ", p_diases=" + p_diases + ", doctor=" + doctor + "]";
	}
}
