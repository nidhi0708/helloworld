package com.example.geometry;

public class Circle implements Shape {
	private int radius;

	public Circle(int r) {
		radius = r;
	}

	@Override
	public void calculateArea() {
		System.out.println(Math.PI * radius * radius);
//		System.out.println(3.14 * radius * radius);
	}

}
