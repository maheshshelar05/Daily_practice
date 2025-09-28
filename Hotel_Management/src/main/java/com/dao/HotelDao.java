package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hotel;



public class HotelDao {

	public void insertData()
	{
		try {
			
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hotel.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Hotel h=new Hotel();
		h.setRoom_id(101);
		h.setRoom_type("Ac-room");
		h.setCity("pune ");
		h.setGuest_name("jayesh");
		h.setIdentity_type("Aadhar card");
		h.setPayment_status("paid");
		
		
		ss.persist(h);
		System.out.println("Data inserted...");
		tr.commit();
		ss.close();
		} catch (Exception e) {
			System.out.println("Error : "+e);
		}
	}
	
	
	public void deleteSingleRecord()
	{
		try {
			
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hotel.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Hotel h=new Hotel();
		int id=1;
		Hotel h1=ss.get(Hotel.class, id);
	
	
		
		
		ss.remove(h1);
		System.out.println("Data is deleted...");
		tr.commit();
		ss.close();
		} catch (Exception e) {
			System.out.println("Error : "+e);
		}
	}
	
	

	public void updateRecord()
	{
		try {
			
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hotel.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		int id=1;
		Hotel h1=ss.get(Hotel.class, id);
		h1.setPayment_status("pending");
	
	
		
		
		ss.merge(h1);
		System.out.println("Data is updated...");
		tr.commit();
		ss.close();
		} catch (Exception e) {
			System.out.println("Error : "+e);
		}
	}
	

	public void getSingleRecord()
	{
		try {
			
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hotel.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Hotel h=new Hotel();
		int id=1;
		Hotel h1=ss.get(Hotel.class, id);
	
		System.out.println(h1);
	
	
		} catch (Exception e) {
			System.out.println("Error : "+e);
		}
	}
	
	
}
