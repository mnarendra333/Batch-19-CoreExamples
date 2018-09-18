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
		//approch-1 -> select full object from DB
		//list of pojos
		Query obj= session.createQuery("from Currency");
		List<Currency> list1 = obj.list();
		
		//conversion from ResultSet to list
		/*
		 * List<Currency> curList = new ArrayList<Currency>();
		 * while(rs.next()){
		 * 		Currency obj = new Currency();
		 * 		obj.setId(rs.getInt(1));
		 * 		obj.setString(rs.getString(2));
		 * 		obj.setString(rs.getString(3));
		 * 		curList.add(obj);
		 * }
		 */
		for (Currency currency : list1) {
			System.out.println(currency.getId()+" "+currency.getName()+" "+currency.getSymbol());
		}
		
		//approch -2 -> select partial object from DB
		//list of object arrays
		Query createQuery = 
				session.createQuery("select c.name, c.symbol from Currency c");
		List<Object[]> list2 = createQuery.list();
		
		/*List<Object[]> curList2 = new ArrayList<Object[]>();
		 * while(rs.next()){
		 * 		Object[] obj = new Object[2];
		 * 		obj[0] = rs.getString(1);
		 * 		obj[1] = rs.getString(2);
		 * 		curList.add(obj);
		 * }
		 * 
		 * 
		 */
		for(Object[] data:list2){
			System.out.println(data[0]+" "+data[1]);
		}
		
		//list of specific property
		Query query3 = session.createQuery("select c.name from Currency c");
		List<String> list3 = query3.list();
		
		/*	List<String> curList2 = new ArrayList<String>();
		 * 	while(rs.next()){
		 * 		curList2.add(rs.getString(1));
		 * }
		 * 
		 */
		for (String string : list3) {
			System.out.println(string);
		}
	}

}
