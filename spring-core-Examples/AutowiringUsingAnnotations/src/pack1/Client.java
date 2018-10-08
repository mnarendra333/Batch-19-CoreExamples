package pack1;

import org.springframework.context.*;
import org.springframework.context.support.*;


public class Client {
	
	public static void main(String[] args) {
		
		
				ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
				Person p = (Person)ctx.getBean("id1");
				p.caluculateTotal();
		
		
	}

}
