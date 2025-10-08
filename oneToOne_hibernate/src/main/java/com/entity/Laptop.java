package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	private int l_id;
	private String lap_company;
	
	
	@Override
	public String toString() {
		return "Laptop [l_id=" + l_id + ", lap_company=" + lap_company + ", lap_price=" + lap_price + "]";
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getLap_company() {
		return lap_company;
	}
	public void setLap_company(String lap_company) {
		this.lap_company = lap_company;
	}
	public String getLap_price() {
		return lap_price;
	}
	public void setLap_price(String lap_price) {
		this.lap_price = lap_price;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int l_id, String lap_company, String lap_price) {
		super();
		this.l_id = l_id;
		this.lap_company = lap_company;
		this.lap_price = lap_price;
	}
	private  String lap_price;
	
}
