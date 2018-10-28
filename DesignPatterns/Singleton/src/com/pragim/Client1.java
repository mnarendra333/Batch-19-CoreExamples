package com.pragim;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Downloader obj1 = Downloader.getInstance();
		Downloader obj2 = Downloader.getInstance();
		
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
		

	}

}
