package com.pragim.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();

	

	

		Student s1 = new Student();
		s1.setStuName("Nikhil");
		s1.setStuAddr("bangl");

		Student s2 = new Student();
		s2.setStuName("Suresh");
		s2.setStuAddr("bangl");
		
		
		Set<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		
		
		Course c1 = new Course();
		c1.setCourseName("JAVA");
		c1.setDuration(120);
		c1.setStudents(students);

		Course c2 = new Course();
		c2.setCourseName("HTML");
		c2.setDuration(30);
		c2.setStudents(students);

		
		
		session.save(c1);
		session.save(c2);
		
		
		
		session.beginTransaction().commit();

	}

}
