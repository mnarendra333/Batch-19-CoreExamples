package pack1;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	
		
		private Caluculator cal;
		
		
		/*public Person(Caluculator cal){
			this.cal = cal;
		}*/
	
		@Autowired
		public void setCal(Caluculator cal) {
			this.cal = cal;
		}

		public void caluculateTotal(){
			int mul = cal.mul(40, 60);
			System.out.println("output is "+mul);
		}

}
