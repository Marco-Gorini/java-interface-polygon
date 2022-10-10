package com.soprasteria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Insert the side of the square.");
		Square square = new Square(in.nextFloat());
		System.out.print("Insert the side of the circle.");
		Circle circle = new Circle(in.nextFloat());
		System.out.println("Perimeter square: " + square.calculatePerimeter());
		System.out.println("Perimeter circle: " + circle.calculatePerimeter());
		System.out.println("Area square: " + square.calculateArea());
		System.out.println("Area circle: " + circle.calculateArea());
	}
}
