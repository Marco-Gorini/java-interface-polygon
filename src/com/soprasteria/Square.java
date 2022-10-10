package com.soprasteria;

public class Square implements Polygon{
	private final float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	
	@Override
	public float calculatePerimeter() {
		return 4*side;
	}

	@Override
	public float calculateArea() {
		return side*side;
	}
	
	
}
