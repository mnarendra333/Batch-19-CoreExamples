package com.pragim.model;

import java.util.List;
import java.util.Scanner;

import javax.persistence.OrderBy;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaClientWithWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		Integer id = sc.nextInt();
		List<Currency> list = session.createQuery("select c from Currency c where c.id=?").setParameter(0, id).list();
		for (Currency currency : list) {
			System.out.println(currency);
		}
		
		
		
		Criteria crit = session.createCriteria(Currency.class);
		System.out.println("enter name");
		String countryName = sc.next();
		List<Currency> list2 = crit.add(Restrictions.eq("name", countryName)).list();
		System.out.println(list2);
		
		Criteria crit2 = session.createCriteria(Currency.class);
		List<Currency> list3 = crit2.addOrder(Order.asc("name")).list();
		System.out.println(list3);
		
		
		
		

	}

}
