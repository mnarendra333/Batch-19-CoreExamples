package com.pragim.ctrl;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.model.Course;
import com.pragim.model.Student;

public class SelectClient {
	
	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		//select all the students corresponding courses
		
		
		
		Query createQuery = session.createQuery("from Student");
		List<Student> list = createQuery.list();
		System.out.println("===================student info============================");
		for (Student student : list) {
			
			
			System.out.println(student.getStuId()+" "+student.getStuName()+" "+student.getStuAddr());
			
			
			Set<Course> courses = student.getCourses();
			System.out.println("===================course info============================");
			for (Course course : courses) {
			
				System.out.println(course.getCourseId()+" "+course.getCourseName()+" "+course.getDuration());
			}
			
		}
		
		
		
		
	}

}
