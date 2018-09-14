package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client {
	
	public static void main(String[] args) {
		
		
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		//prepare your model
		Currency obj  =new Currency();
		obj.setId(3);
		obj.setName("SRL");
		obj.setSymbol("&");
		
		session.save(obj);
		
		session.beginTransaction().commit();
		
		
		
		
		
		
		
	}

}
