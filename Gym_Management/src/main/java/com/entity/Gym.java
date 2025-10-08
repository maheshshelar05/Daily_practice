package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Gym_Data")
public class Gym {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int client_id;
	private String full_name;
	private String gender;
	private int age;
	private long contact_number;
	private String email;
	private String address;
	
	private String membership_type;
	private String start_date;
	private String end_date;
	private String payment;

	public int getClient_id() {
		return client_id;
	}

	public Gym() {

	}

	public Gym(int client_id, String full_name, String gender, int age, long contact_number, String email,
			String address, String membership_type, String start_date, String end_date, String payment) {
		super();
		this.client_id = client_id;
		this.full_name = full_name;
		this.gender = gender;
		this.age = age;
		this.contact_number = contact_number;
		this.email = email;
		this.address = address;
		this.membership_type = membership_type;
		this.start_date = start_date;
		this.end_date = end_date;
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Gym [client_id=" + client_id + ", full_name=" + full_name + ", gender=" + gender + ", age=" + age
				+ ", contact_number=" + contact_number + ", email=" + email + ", address=" + address
				+ ", membership_type=" + membership_type + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", payment=" + payment + "]";
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMembership_type() {
		return membership_type;
	}

	public void setMembership_type(String membership_type) {
		this.membership_type = membership_type;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	

}
