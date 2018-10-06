package com.pragim.model;

public class Mobile implements ElectronicDevice {

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

}
