package pack1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CollectionOperationsJunit {
	
	static CollectionOperations obj;
	static CollectionOperationsJunit objJunit;
	String name;
	int index;
	
	@BeforeClass
	public static void setUp(){
		obj = new CollectionOperations();
		objJunit  =new CollectionOperationsJunit();
	}
	
	@Before
	public void inputsToOurTest(){
		
		name = "Ravi";
		index=0;
		
	}
	@Test
	public void testSize(){
		assertEquals(5, obj.findSize());
	}
	
	@Test
	public void testToFindIndexOfPerson(){
		assertEquals("Ravi",obj.getPerson(index));
	}
	
	@Test
	public void testForExistance(){
		assertEquals(true,obj.findName(name));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testException(){
		
		assertEquals("Ravi", obj.getPerson(500));
	}
	
	@Test(timeout=3000)
	public void timerTest(){
		obj.doTask();
	}

}
