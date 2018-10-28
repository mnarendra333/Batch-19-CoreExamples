package com.pragim;

public class Downloader {
	
	//eager singleton
	private static Downloader downloader;
	
	private Downloader(){
		
		
	}

	public static Downloader getInstance(){
		if(downloader == null)
			downloader = new Downloader();
		
		return downloader;
	}
	

}
