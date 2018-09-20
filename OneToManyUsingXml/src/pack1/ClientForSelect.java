package pack1;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientForSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		Vendor vendor = (Vendor)session.get(Vendor.class, 1);
		
		System.out.println(vendor.getVenId()+" "+vendor.getVenName());
		
		
		Set<Customer> customerList = vendor.getCustomerList();
		
		for (Customer customer : customerList) {
			System.out.println(customer);
		}

	}

}
