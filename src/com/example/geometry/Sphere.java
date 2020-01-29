package com.example.geometry;

public class Sphere implements ThreeDShape {

	private int radius;

	public Sphere(int r) {
		radius = r;
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
