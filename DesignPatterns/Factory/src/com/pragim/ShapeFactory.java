package com.pragim;

public class ShapeFactory {
	
	
	public static Shape getShape(String type){
		
		Shape obj=null;
		
		if(type.equals("Square"))
			obj =  new Square();
		else if(type.equals("Rectangle"))
			obj =  new Rectangle();
		
		return obj;
	}

}
