package com.pragim.model;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class NativeSQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session  = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		/*SQLQuery createSQLQuery = session.createSQLQuery("select * from currency");
		List<Object[]> list  =createSQLQuery.list();
		
		
		for (Object[] objects : list) {
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
		}*/
		
		
		SQLQuery createSQLQuery2 = session.createSQLQuery("select * from currency where cur_id=?");
		createSQLQuery2.setParameter(0, 4);
		
		List<Object[]> list2  =createSQLQuery2.list();
		for (Object[] objects : list2) {
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
		}
	}

}
