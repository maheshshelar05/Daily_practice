package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentLap")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stud_id;
	private String stud_name;
	
	@OneToOne
	Laptop lapt;
	

	public Student(int stud_id, String stud_name, Laptop lapt) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.lapt = lapt;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public Laptop getLapt() {
		return lapt;
	}

	public void setLapt(Laptop lapt) {
		this.lapt = lapt;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", lapt=" + lapt + "]";
	}
	
	
	
}
