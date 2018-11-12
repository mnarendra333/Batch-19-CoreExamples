package pack1;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CollectionsOperationJunit {
	
	
	static CollectionsOperations obj = null;
	@BeforeClass
	public static void prepareData(){
		obj = new CollectionsOperations();
	}
	
	
	@Test
	public void testSize(){
		
		assertEquals(4, obj.totalSize());
	}

}
