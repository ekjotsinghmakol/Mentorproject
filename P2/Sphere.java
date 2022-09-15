package com.P2;

public class Sphere {
	int radius = 1;
	double xCenter;
	double yCenter;
	double zCenter;

	public Sphere() {
		this.radius = 1;
		
	}

	public Sphere(double xCenter, double yCenter, double zCenter) {
		this();
		this.xCenter = xCenter;
		this.yCenter = yCenter;
		this.zCenter = zCenter;
	}

	public Sphere(int radius, double xCenter, double yCenter, double zCenter) {
		this(xCenter, yCenter, zCenter);
		this.radius = radius;
	}

	public String toString() {// overriding the toString() method
		return radius + " " + xCenter + " " + yCenter + " " + zCenter;
	}


}
