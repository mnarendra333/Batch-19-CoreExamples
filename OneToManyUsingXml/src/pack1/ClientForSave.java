package pack1;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientForSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Customer c1 = new Customer();
		c1.setCustId(101);
		c1.setCustName("Cap");
		c1.setCustAddr("bangl");
		

		Customer c2 = new Customer();
		c2.setCustId(102);
		c2.setCustName("TCS");
		c2.setCustAddr("bangl");
		

		Customer c3 = new Customer();
		c3.setCustId(103);
		c3.setCustName("INFY");
		c3.setCustAddr("bangl");
		
		
		
		Set<Customer> cList = new HashSet<Customer>();
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		
		
		//parent info
		
		Vendor v = new Vendor();
		v.setVenId(1);
		v.setVenName("CISCO");
		v.setCustomerList(cList);
		
		
		session.save(v);
		session.beginTransaction().commit();
		
		
		
		
		
		

	}

}
