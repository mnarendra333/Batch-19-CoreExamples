package pack1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CaluculatorJunit {
	
	
	int x;
	int y;
	
	static Caluculator c = null;
	static CaluculatorJunit obj = null;
	
	
	@BeforeClass
	public  static void  prepareData(){
		c = new Caluculator();
		obj = new CaluculatorJunit();
		
	}
	
	@Before
	public void intializeData(){
		
		obj.x = 200;
		obj.y = 20;
		
	}
	
	@Test
	@Ignore
	public void sumTest(){
		
		assertEquals(220, c.sum(obj.x, obj.y));
	}
	
	@Test
	public void subTest(){
		assertEquals(160, c.sub(obj.x, obj.y));
	}
	
	@Test
	public void mulTest(){
		assertEquals(4000, c.mul(obj.x, obj.y));
	}
	
	@Test
	public void divTest(){
		assertEquals(10, c.div(obj.x, obj.y));
	}
	
	@Test(timeout=5000)
	public void timerTest(){
		
		/*for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}*/
	}
	
	@Test(expected = NullPointerException.class)
	public void testException(){
		
		String s1 = null;
		s1.length();
	}
}
