package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String[] args) {
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		Vendor v = new Vendor();
		v.setVendId(1);
		v.setVenName("CISCO");
		
		
		Customer c1 = new Customer();
		c1.setCustId(101);
		c1.setCustName("INFY");
		c1.setCustAddr("bangl");
		c1.setVendor(v);
		
		Customer c2 = new Customer();
		c2.setCustId(102);
		c2.setCustName("CTS");
		c2.setCustAddr("bangl");
		c2.setVendor(v);
		
		
		session.save(c1);
		session.save(c2);
		
		
		session.beginTransaction().commit();
		
	}

}
