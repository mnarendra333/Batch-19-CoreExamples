package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Client {
	
	public static void main(String[] args) {
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.openSession();
		
		Product product = (Product)session1.load(Product.class, 3);
		System.out.println(product);
		
		session1.close();
		
		try {
			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Session session2 = factory.openSession();
		Product product2 = (Product)session2.load(Product.class, 3);
		System.out.println(product2);
	}

}
