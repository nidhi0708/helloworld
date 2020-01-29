package com.example.geometry;

public class Cube implements ThreeDShape {

	private int side;

	public Cube(int s) {
		side = s;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area formula");
	}

	@Override
	public void calulateVolume() {
		System.out.println("Volume formula");
	}

}
