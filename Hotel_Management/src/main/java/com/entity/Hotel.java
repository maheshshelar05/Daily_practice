package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hotel_Data")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guest_id;
	@Column(nullable = false, unique = true)
	private int room_id;
	private String room_type;
	private String guest_name;
	private String identity_type;
	//@Column(name = "guest_Address")  //it change the column or field  name 
	private String city;
	private String payment_status;

	public int getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public String getGuest_name() {
		return guest_name;
	}

	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}

	public String getIdentity_type() {
		return identity_type;
	}

	public void setIdentity_type(String identity_type) {
		this.identity_type = identity_type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public Hotel(int guest_id, int room_id, String room_type, String guest_name, String identity_type, String city,
			String payment_status) {
		super();
		this.guest_id = guest_id;
		this.room_id = room_id;
		this.room_type = room_type;
		this.guest_name = guest_name;
		this.identity_type = identity_type;
		this.city = city;
		this.payment_status = payment_status;
	}

	@Override
	public String toString() {
		return "hotel [guest_id=" + guest_id + ", room_id=" + room_id + ", room_type=" + room_type + ", guest_name="
				+ guest_name + ", identity_type=" + identity_type + ", city=" + city + ", payment_status="
				+ payment_status + "]";
	}

	public Hotel() {

	}

}
