package com.pragim.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class CriteriaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//full object selection
		Criteria criteria = session.createCriteria(Currency.class);
		List<Currency> list = criteria.list();
		for(Currency obj1:list){
			System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getSymbol());
		}
		
		
		//partial object selection
		Criteria crit2 = session.createCriteria(Currency.class);
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("name"));
		projectionList.add(Projections.property("symbol"));
		
		crit2.setProjection(projectionList);
		
		List<Object[]> list2 = crit2.list();
		for (Object[] objects : list2) {
			System.out.println(objects[0]+" "+objects[1]);
		}
		
		//selecting single property
		
		Criteria crit3 = session.createCriteria(Currency.class);
		crit3.setProjection(Projections.property("name"));
		
		@SuppressWarnings("unchecked")
		List<String> list3 = crit3.list();
		for (String string : list3) {
			System.out.println(string);
		}
		
		
		
	}

}
