package com.pragim.model;

public class Person {

	private ElectronicDevice device;

	public void setDevice(ElectronicDevice device) {
		this.device = device;
	}
	
	
	
	
	
	public void getDevice(){
		
		device.switchOn();
		String specs = device.getSpecs();
		System.out.println(specs);
		device.doWork();
		device.switchOFF();
		
	}

}
