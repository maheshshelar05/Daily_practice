package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);

	
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Laptop l=new Laptop();
		l.setL_id(1001);
		l.setLap_company("Dell");
		l.setLap_price("50000");
		ss.persist(l);
		
		Student s=new Student();
		s.setLapt(l);
		s.setStud_name("Jayesh");
		
		
		System.out.println("Data Inserted...");
		ss.persist(s);
		tr.commit();
		ss.close();
		
	}
}
