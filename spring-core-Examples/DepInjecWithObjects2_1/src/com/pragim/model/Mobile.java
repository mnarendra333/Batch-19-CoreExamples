package com.pragim.model;

public class Mobile implements ElectronicDevice {
	
	
	private double price;
	private String model;
	private String ramSize;
	private String hardDisk;
	
	
	

	public void setPrice(double price) {
		this.price = price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("My Mobile swichedon");
	}

	@Override
	public void switchOFF() {
		// TODO Auto-generated method stub
		System.out.println("My Mobile swichedoff");
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("paying the bills using mobile");
	}
	
	
	public String getSpecs(){
		
		return price+" "+model+" "+ramSize+" "+hardDisk;
	}

}
