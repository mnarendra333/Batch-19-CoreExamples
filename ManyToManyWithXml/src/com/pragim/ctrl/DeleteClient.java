package com.pragim.ctrl;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.model.Course;
import com.pragim.model.Student;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Student stu = (Student)session.get(Student.class, 41);
		
		Set<Course> courses = stu.getCourses();
		
		Iterator<Course> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Course course =  iterator.next();
			
			if(course.getCourseName().equalsIgnoreCase("Angular"))
				iterator.remove();
			
		}
		
		session.beginTransaction().commit();

	}

}
