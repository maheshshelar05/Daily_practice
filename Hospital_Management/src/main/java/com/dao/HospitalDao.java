package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class HospitalDao {

	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Hospital h = new Hospital();
		h.setFull_name("Mayur patil");
		h.setAge(28);
		h.setAdmission_date("30/09/2025");
		h.setContact_number(1234567890);
		h.setEmail("mayur@gmail.com");
		h.setGender("male");
		h.setAddress("Mumbai");
		h.setDisease("fever");
		h.setDoctor_assigned("Dr dhiraj");
		h.setRoom_number(5);

		ss.persist(h);
		tr.commit();
		ss.close();

	}
	

}
