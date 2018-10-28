package com.pragim;

public class Downloader {
	
	//eager singleton
	private static Downloader downloader=new Downloader();
	
	//private constructor
	private Downloader(){
		
	}
	
	//public method to give the object to the clients
	public static Downloader getInstance(){
		return Downloader.downloader;
	}
	

}
