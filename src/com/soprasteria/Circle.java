package com.soprasteria;

public class Circle implements Polygon{
	private final float ray;
	
	
	
	public Circle(float ray) {
		super();
		this.ray = ray;
	}

	@Override
	public float calculatePerimeter() {
		return (float) (ray*2*3.14);
	}
	
	@Override
	public float calculateArea() {
		return (float) (ray*ray*3.14);
	}
}