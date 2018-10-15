package com.pragim.SpringDIApp;

public class SampleBean {
	
	
	private Caluculator cal;
	
	
	public void setCal(Caluculator cal){
		this.cal = cal;
	}
	
	
	
	
	
	public void  doWork(){
		
		int mul = cal.mul(45, 68);
		System.out.println("mul is "+mul);
	}
	
	

}
