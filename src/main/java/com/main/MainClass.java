package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Doctor;
import com.entity.Patient;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Doctor.class);
		cfg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Doctor doc = new Doctor();
		doc.setD_id(1);
		doc.setD_name("Nandidni");
		
		Patient p = new Patient();
		p.setP_id(1);
		p.setP_name("yash");
		p.setP_diases("Fever");
		p.setDoctor(doc);

		Patient p1 = new Patient();
		p1.setP_id(2);
		p1.setP_diases("headache");
		p1.setP_name("krish");
		p1.setDoctor(doc);

		ArrayList<Patient> list = new ArrayList<>();
		list.add(p);
		list.add(p1);
		
		ss.persist(doc);
		ss.persist(p);
		ss.persist(p1);

		tr.commit();
		ss.close();

	}
}
