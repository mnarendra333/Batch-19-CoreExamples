package com.pragim;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Shape shape = ShapeFactory.getShape(args[0]);
		shape.draw();

	}

}
