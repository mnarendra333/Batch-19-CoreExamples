package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ApplicationContext childContainer = new ClassPathXmlApplicationContext("spring-config2.xml");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});
		Traveller t= (Traveller)ctx.getBean("id1");
		t.startJourny();

	}

}
