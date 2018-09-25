package com.pragim.ctrl;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.model.Course;
import com.pragim.model.Student;

public class Client {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		
		
		
		Course c1 = new Course();
		c1.setCourseName("JAVA");
		c1.setDuration(120);
		
		Course c2 = new Course();
		c2.setCourseName("HTML");
		c2.setDuration(30);
		
		Course c3 = new Course();
		c3.setCourseName("Angular");
		c3.setDuration(45);
		
		
		
		//this collection is going hold all the courses
		Set<Course> courses = new HashSet<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		
		
		
		Student s1 = new Student();
		s1.setStuName("Nikhil");
		s1.setStuAddr("bangl");
		s1.setCourses(courses);
		
		Student s2 = new Student();
		s2.setStuName("Suresh");
		s2.setStuAddr("bangl");
		s2.setCourses(courses);
		
		
		
		session.save(s1);
		session.save(s2);
		
		session.beginTransaction().commit();
		
		
		
		
	}

}
