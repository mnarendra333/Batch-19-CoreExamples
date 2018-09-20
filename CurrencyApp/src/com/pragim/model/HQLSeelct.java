package com.pragim.model;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HQLSeelct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfiguration obj  =new AnnotationConfiguration();
		obj.configure("hibernate.cfg.xml");
		
		SessionFactory factory = obj.buildSessionFactory();
		Session session = factory.openSession();
		/*
		Query query = session.createQuery("from Currency c");
		List<Currency> list = query.list();
		for(Currency obj1:list){
			System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getSymbol());
		}
		
		
		Query query2 = session.createQuery("select c.name,c.symbol from Currency c");
		List<Object[]> list2 = query2.list();
		for(Object[] data:list2){
			System.out.println(data[0]+" "+data[1]);
		}
		
		
		Query query3 = session.createQuery("select c.name from Currency c");
		List<String> list3 = query3.list();
		for (String string : list3) {
			System.out.println(string);
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id value");
		Integer number = sc.nextInt();
		System.out.println("enter country name");
		String country = sc.next();
		
		Query quryobj = 
				session.createQuery("select c from Currency c where c.id=:id and c.name = :coun_name");
		quryobj.setParameter("id", number);
		quryobj.setParameter("coun_name", country);
		List<Currency> list = quryobj.list();
		System.out.println(list);
		
		
		/*Query queryobj2 = session.createQuery("select c from Currency c where c.id=?");
		queryobj2.setParameter(0, number);
		List<Currency> list2 = queryobj2.list();
		System.out.println(list2);*/
		
		
		
	}

}
