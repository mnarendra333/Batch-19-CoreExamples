package com.pragim.model;

public class Person {

	private ElectronicDevice device;

	public void setDevice(ElectronicDevice device) {
		this.device = device;
	}
	
	
	
	
	
	public void getDevice(){
		
		device.switchOn();
		device.doWork();
		device.switchOFF();
	}

}
