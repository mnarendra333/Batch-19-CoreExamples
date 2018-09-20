package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClientForSaveWithGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Currency obj  =new Currency();
		obj.setName("China");
		obj.setSymbol("^");
		
		session.save(obj);
		
		
		session.beginTransaction().commit();
		System.out.println("Done!");
	}

}
