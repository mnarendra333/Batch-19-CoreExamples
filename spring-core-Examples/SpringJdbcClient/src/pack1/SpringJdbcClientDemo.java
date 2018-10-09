package pack1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;




import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcClientDemo {

	private JdbcTemplate template;
	
	private DataSource dataSource;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}

	public void insertData() {

		//template.execute("insert into product_tab values(45,'Lenovo-t1',60000)");
		//template.execute("create table my_tab(id number(10),name varchar2(20))");
		
		
	//	template.setDataSource(dataSource);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		int no = sc.nextInt();
		String pname = sc.next();
		double price  =sc.nextDouble();
		
		int count = 
				
				template.update("insert into product_tab values(?,?,?)", new Object[]{no,pname,price});
		
		System.out.println(count +" rows got effected");
			
	}
	public void selectData(){	
		List<Map<String, Object>> queryForList =
				template.queryForList("select * from product_tab");
		
		
		for (Map<String, Object> map : queryForList) {
			System.out.println(map);
		}
	}

}
