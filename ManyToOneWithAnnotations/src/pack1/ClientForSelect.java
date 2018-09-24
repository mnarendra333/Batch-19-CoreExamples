package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientForSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Customer cust = (Customer)session.load(Customer.class, 101);
		System.out.println(cust);
		
		
		Vendor vendor = cust.getVendor();
		System.out.println(vendor);
		

	}

}
