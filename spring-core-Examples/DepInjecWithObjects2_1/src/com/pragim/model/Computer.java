package com.pragim.model;

public class Computer implements ElectronicDevice {
	
	private double price;
	private String model;
	private String ramSize;
	private String hardDisk;
	

	@Override
	public void switchOn() {
		
		System.out.println("My windows compuer is stated");
	}

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
