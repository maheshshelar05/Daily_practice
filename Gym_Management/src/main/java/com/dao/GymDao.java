package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Gym;

import jakarta.persistence.criteria.Root;

public class GymDao {

	public void insertData() {

		try {

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Gym.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();

			Gym g = new Gym();
			g.setFull_name("jayesh Patil");
			g.setAge(19);
			g.setContact_number(1234567890);
			g.setEmail("jayesh@gmai.com");
			g.setGender("Male");
			g.setMembership_type("Monthly");
			g.setPayment("Pending");
			g.setAddress("Mumabai");
			g.setStart_date("01/09/2025");
			g.setEnd_date("01/10/2025");

			ss.persist(g);
			tr.commit();
			ss.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}

	public void updateRecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Gym.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Gym set address=: address where client_id=:myid";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("address", "Dhule");
		query.setParameter("myid", 1);
		query.executeUpdate();

		System.out.println("Data is updated..");

		tr.commit();
		ss.close();

	}

	public void getSinglerecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Gym.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Gym where client_id=:myid";
		Query<Gym> query = ss.createQuery(hqlquery, Gym.class);

		query.setParameter("myid", 1);

		Gym g = query.uniqueResult();
		System.out.println(g);

		tr.commit();
		ss.close();
	}

	public void getAllRecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Gym.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		
		// with HQL 
//		String hqlquery = "from Gym";
//		Query<Gym> query = ss.createQuery(hqlquery, Gym.class);
//		java.util.List<Gym> list = query.list();
//
//		for (Gym gym : list) {
//			System.out.println(gym);
//		}

		
		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Gym> cq = hcb.createQuery(Gym.class);
		Root<Gym> g = cq.from(Gym.class);
		cq.select(g);

		Query<Gym> query = ss.createQuery(cq);
		List<Gym> list = query.list();
		
		for (Gym gym : list) {
			
			System.out.println(gym);
		}
	}

	public void deleteRecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Gym.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "delete from Student where id=:myid";
		Query<Gym> query = ss.createQuery(hqlQuery);
		query.setParameter("myid", 1);
		query.executeUpdate();

		System.out.println("data is Deleted...");

		tr.commit();
		ss.close();
	}
}
