package com.pragim.model;

public class Computer implements ElectronicDevice {
	
	private double price;
	private String model;
	private String ramSize;
	private String hardDisk;
	

	public Computer(double price, String model, String ramSize, String hardDisk) {
		super();
		this.price = price;
		this.model = model;
		this.ramSize = ramSize;
		this.hardDisk = hardDisk;
	}



	@Override
	public void switchOn() {
		
		System.out.println("My windows compuer is stated");
	}



	@Override
	public void switchOFF() {
		System.out.println("My windows compuer is shutting down");
	}

	@Override
	public void doWork() {
		System.out.println("pay bill using computer");
	}

	@Override
	public String getSpecs() {
		return price+" "+model+" "+ramSize+" "+hardDisk;
	}

}
