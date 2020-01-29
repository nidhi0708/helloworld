package com.example.geometry;

public class Square implements Shape {
	private int side;

	public Square(int s) {
		side = s;
	}

	@Override
	public void calculateArea() {
		System.out.println(side * side);
	}

}
