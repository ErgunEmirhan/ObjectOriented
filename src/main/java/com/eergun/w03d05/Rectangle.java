package com.eergun.w03d05;

public class Rectangle {
	public double width;
	public double height;
	
	public double getArea(){
		return width*height;
	}
	
	public double getCircumference(){
		return 2*(width+height);
	}
	
	public double ratio(){
		return width/height;
	}
	
}