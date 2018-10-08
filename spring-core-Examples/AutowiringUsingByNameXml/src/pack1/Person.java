package pack1;

public class Person {
	
	
		private Caluculator cal;
		
		public void setCal(Caluculator cal){
			System.out.println("inside setter");
			this.cal = cal;
		}
		
	/*	public Person(Caluculator cal){
			System.out.println("inside constructor");
			this.cal = cal;
		}
		*/
	
		public void caluculateTotal(){
			int mul = cal.mul(40, 60);
			System.out.println("output is "+mul);
		}

}
