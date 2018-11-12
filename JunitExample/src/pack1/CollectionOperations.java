package pack1;

import java.util.ArrayList;

public class CollectionOperations {
	
	static ArrayList<String> al = new ArrayList<String>();
	static{
		
		al.add("Ravi");
		al.add("John");
		al.add("Miller");
		al.add("Srav");
		al.add("Kumar");
	}
	
	public void addData(){
		
		
	
	}
	
	public int findSize(){
		
		return al.size();
	}
	
	public boolean findName(String name){
		
		return al.contains(name);
	}
	
	public String getPerson(int index){
		return al.get(index);
	}
	
	
	public void doTask(){
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
