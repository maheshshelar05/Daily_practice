package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hospital_Data")
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patient_ID;
	private String full_name;
	private String gender;
	private int age;
	private long contact_number;
	private String address;
	private String email;
	private String admission_date;
	private String disease;
	private String doctor_assigned;
	private int room_number;
	private String treatment_status;
	public int getPatient_ID() {
		return patient_ID;
	}
	public void setPatient_ID(int patient_ID) {
		this.patient_ID = patient_ID;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdmission_date() {
		return admission_date;
	}
	public void setAdmission_date(String admission_date) {
		this.admission_date = admission_date;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctor_assigned() {
		return doctor_assigned;
	}
	public void setDoctor_assigned(String doctor_assigned) {
		this.doctor_assigned = doctor_assigned;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public String getTreatment_status() {
		return treatment_status;
	}
	public void setTreatment_status(String treatment_status) {
		this.treatment_status = treatment_status;
	}
	public Hospital(int patient_ID, String full_name, String gender, int age, long contact_number, String address,
			String email, String admission_date, String disease, String doctor_assigned, int room_number,
			String treatment_status) {
		super();
		this.patient_ID = patient_ID;
		this.full_name = full_name;
		this.gender = gender;
		this.age = age;
		this.contact_number = contact_number;
		this.address = address;
		this.email = email;
		this.admission_date = admission_date;
		this.disease = disease;
		this.doctor_assigned = doctor_assigned;
		this.room_number = room_number;
		this.treatment_status = treatment_status;
	}
	public Hospital() {
		
	}
	@Override
	public String toString() {
		return "Hospital [patient_ID=" + patient_ID + ", full_name=" + full_name + ", gender=" + gender + ", age=" + age
				+ ", contact_number=" + contact_number + ", address=" + address + ", email=" + email
				+ ", admission_date=" + admission_date + ", disease=" + disease + ", doctor_assigned=" + doctor_assigned
				+ ", room_number=" + room_number + ", treatment_status=" + treatment_status + "]";
	}
	
	
	
}
