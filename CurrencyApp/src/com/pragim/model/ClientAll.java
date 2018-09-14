package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClientAll {
	
	public static void main(String[] args) {
		
		
		
		Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		/*Currency obj = (Currency)session.load(Currency.class, 1);
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSymbol());*/
		
		Currency obj1 = (Currency)session.get(Currency.class, 1);
		System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getSymbol());
		
		
		if(obj1!=null)
			session.delete(obj1);
		session.beginTransaction().commit();
		
	}

}
