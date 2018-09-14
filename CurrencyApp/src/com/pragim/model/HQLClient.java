package com.pragim.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		//from Currency (select all the records)
		Query obj= session.createQuery("select c from Currency c where c.id=2");
		List<Currency> list = obj.list();
		for (Currency currency : list) {
			System.out.println(currency.toString());
		}

	}

}
