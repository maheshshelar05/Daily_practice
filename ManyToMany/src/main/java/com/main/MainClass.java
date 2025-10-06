package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Project;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Project.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Employee e=new Employee();
		e.setEmp_id(1);
		e.setEmp_name("Suraj");
		
		Employee e1=new Employee();
		e1.setEmp_id(2);
		e1.setEmp_name("Mahesh");
		
		Project p=new Project();
		p.setP_id(1);
		p.setP_name("Bank_management");
		
		Project p1=new Project();
		p1.setP_id(2);
		p1.setP_name("collage_management");
		
		ArrayList< Employee> emp_list=new ArrayList<Employee>();
		ArrayList< Project> project_list=new ArrayList<Project>();
		
		emp_list.add(e);
		emp_list.add(e1);
		
		project_list.add(p);
		project_list.add(p1);
		
		e.setProjects(project_list);
		p.setEmployees(emp_list);
		
		ss.persist(e);
		ss.persist(e1);
		ss.persist(p);
		ss.persist(p1);
		
		tr.commit();
		ss.close();
		
	}
}
