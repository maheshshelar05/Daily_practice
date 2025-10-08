package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int t_id;
	private String t_name;
	private String sub;
	
	@OneToMany(mappedBy = "teacher")

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Teacher(int t_id, String t_name, String sub) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.sub = sub;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", t_name=" + t_name + ", sub=" + sub + "]";
	}

}
