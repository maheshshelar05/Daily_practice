package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Library_Data")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int member_id;
	@Column(nullable = false, unique = true)
	private String full_name;
	private String email;
	private int phone_no;
	private String address;
	private String startingDate;
	private String endingDate;
	private String membershipType;

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Library() {
		
	}

	@Override
	public String toString() {
		return "Library [member_id=" + member_id + ", full_name=" + full_name + ", email=" + email + ", phone_no="
				+ phone_no + ", address=" + address + ", startingDate=" + startingDate + ", endingDate=" + endingDate
				+ ", membershipType=" + membershipType + "]";
	}

	public Library(int member_id, String full_name, String email, int phone_no, String address, String startingDate,
			String endingDate, String membershipType) {
		super();
		this.member_id = member_id;
		this.full_name = full_name;
		this.email = email;
		this.phone_no = phone_no;
		this.address = address;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.membershipType = membershipType;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}

	public String getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

}
