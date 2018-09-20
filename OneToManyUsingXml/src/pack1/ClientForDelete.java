package pack1;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientForDelete {
	
	
	public static void main(String[] args) {
		
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		Vendor vendor = (Vendor)session.get(Vendor.class, 1);
		
		
		Set<Customer> customerList = vendor.getCustomerList();
		/*for (Customer customer : customerList) {
			if(customer.getCustName().equalsIgnoreCase("INFY"))
				session.delete(customer);
		}*/
		
		Iterator<Customer> iterator = customerList.iterator();
		
		while(iterator.hasNext()){
			Customer customer = iterator.next();
			if(customer.getCustName().equalsIgnoreCase("TCS"))
				iterator.remove();
		}
		
		session.beginTransaction().commit();
		
		
	}

}
