package com.pragim.model;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HQLNonSelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();

		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter no of values to delete");
		int countOfRec = sc.nextInt();
		Integer array[] = new Integer[countOfRec];
		for (int i = 0; i < countOfRec; i++) {
			
			array[i] = sc.nextInt();
		}
		
		List<Integer> asList = Arrays.asList(array);*/
		
		/*StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			if(i != countOfRec-1)
				sb.append(i).append(",");
			else
				sb.append(i);
		}
		*/
		//String inputs = sb.toString();
		
		Query query = session.createQuery("delete from Currency c where id in (2,3)");
		int count = query.executeUpdate();
		Transaction tx = session.beginTransaction();
		tx.commit();
	}

}
