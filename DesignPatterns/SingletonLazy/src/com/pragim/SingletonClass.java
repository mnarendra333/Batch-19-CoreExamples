package com.pragim;

public enum SingletonClass {
	
	
	INSTANCE;
	
	public  void startDownloading(){
		System.out.println("downlaoding software...");
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(SingletonClass.INSTANCE.hashCode());
		System.out.println(SingletonClass.INSTANCE.hashCode());
		
		SingletonClass.INSTANCE.startDownloading();
		
		
	}

}
