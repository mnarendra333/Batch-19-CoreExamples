package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		
			SpringJdbcClientDemo obj = (SpringJdbcClientDemo)ctx.getBean("id1");
		//	obj.insertData();
			obj.selectData();
		
		
	}

}
