package com.pragim.model;

public class Computer implements ElectronicDevice {

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

}
