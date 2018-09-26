package com.pragim.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Clisen3_2Courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();

	
		Student student = new Student();
		student.setStuName("Surya");
		student.setStuAddr("bangl");
		
		
		List<Course> courseList = session.createCriteria(Course.class).add(Restrictions.in("courseId", new Object[]{2,3})).list();
	

		Set<Course> coursesset = new HashSet<Course>(courseList);
		student.setCourses(coursesset);
		
		
		session.save(student);
		
		session.beginTransaction().commit();
	
		

	}

}
