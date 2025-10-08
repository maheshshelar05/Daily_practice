package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Library;

public class LibraryDao {
	
	
	

	public void insertRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Library l = new Library();
		l.setFull_name("jayesh");
		l.setEmail("jayesh@gmail.com");
		l.setAddress("pune");
		l.setPhone_no(1234567890);
		l.setStartingDate("01/09/25");
		l.setEndingDate("07/09/25");
		l.setMembershipType("Student");

		ss.persist(l);
		System.out.println("Data inserted ");
		tr.commit();
		ss.close();

	}
	
	public void deletesingleRecord()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Library l = new Library();
		int id=1;
		
		Library l1 = ss.get(Library.class, id);
		ss.remove(l1);
		tr.commit();
		ss.close();
	}

	
	public void updateRecord() {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		int id=2;
		Library l = ss.get(Library.class, id);
		l.setAddress("Mumbai");
		
		
	//	ss.update(l);
		
		ss.merge(l);
		tr.commit();
		ss.close();
 	}
	
	
	public void getSingleRecord() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int id=2;
		Library l=ss.get(Library.class, id);
		System.out.println(l);
		
	}
	
	
}
