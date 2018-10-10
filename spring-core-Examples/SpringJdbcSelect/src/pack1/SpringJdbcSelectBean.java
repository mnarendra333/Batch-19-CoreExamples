package pack1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class SpringJdbcSelectBean {
	
	
		private JdbcTemplate template;
		
		
		public void setTemplate(JdbcTemplate template){
			this.template = template;
		}
		
		public void selectData(){
			
			List<Map<String, Object>> queryForList = template.queryForList("select * from product_tab");
			System.out.println(queryForList);
			
		}
		
		
		public void selectListOfObjects(){
			
			
			/*List<Product> data = template.query("select * from product_tab", new ResultSetExtractor<List<Product>>() {

				@Override
				public List<Product> extractData(ResultSet rs) throws SQLException,
						DataAccessException {
					// TODO Auto-generated method stub
					List<Product> prodList = new ArrayList<Product>();
					while (rs.next()) {
						Product p  =new Product();
						p.setPid(rs.getInt(1));
						p.setPname(rs.getString(2));
						p.setPrice(rs.getDouble(3));
						prodList.add(p);
					}
					return prodList;
				}
			});*/
			
			
			
			List<Product> data = template.query("select * from product_tab", new MyResultSetExtracot());
			
			for (Product product : data) {
				System.out.println(product);
			}
			
		}
		
		
		
		public void selectAllDataUsingRowMapper(){
			
			
		/*	List<Product> data = template.query("select * from product_tab", new RowMapper<Product>() {

				@Override
				public Product mapRow(ResultSet rs, int rowNum)
						throws SQLException {
					// TODO Auto-generated method stub
					Product p  =new Product();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setPrice(rs.getDouble(3));
					return p;
				}
			});*/
			
			
			//List<Product> data = template.query("select * from product_tab where pid=?",new MyRowMapper());
			List<Product> data = template.query("select * from product_tab where pid=?", new Object[]{46},new MyRowMapper());
			for (Product product : data) {
				System.out.println(product);
			}
		}
		
		
		
		public static void main(String[] args) {
			
			
				ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
				SpringJdbcSelectBean obj = (SpringJdbcSelectBean)ctx.getBean("id1");
				//obj.selectData();
				//obj.selectListOfObjects();
				obj.selectAllDataUsingRowMapper();
			
			
		}
		

}
class MyResultSetExtracot implements ResultSetExtractor<List<Product>>{

	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		// TODO Auto-generated method stub
		List<Product> prodList = new ArrayList<Product>();
		while (rs.next()) {
			Product p  =new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			prodList.add(p);
		}
		return prodList;
	}
	
	
	
	
}
class MyRowMapper implements RowMapper<Product>
{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product p  =new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getDouble(3));
		return p;
	}
	
}
