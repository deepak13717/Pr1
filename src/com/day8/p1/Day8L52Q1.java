/*
Q1)Create a class circle and use inheritance to create another class cylinder from it

 */
package com.day8.p1;

import java.util.Scanner;


public class Day8L52Q1 {
	public static void main(String...args){
		System.out.println("Hello welcome to inheritance!");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius:");
		Circle c1 = new Circle(sc.nextFloat());
		System.out.println("-----------Circle-----------------------------------");
		System.out.println("\tradius:"+c1.getRadius());
		System.out.println("\tdiameter:"+c1.getDiameter());
		System.out.println("\tcircumference:"+c1.getCircumference());
		System.out.println("\tarea:"+c1.getArea());
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------Cylinder-----------------------------------");
		Cylinder c2 = new Cylinder();
		System.out.println("\tradius of Cylinder:"+c2.getRadius());
		System.out.println("\theight of Cylinder:"+c2.getHeight());
		System.out.println("\tdiameter:"+c2.getDiameter());
		System.out.println("\tcircumference:"+c2.getCircumference());
		System.out.println("\tbase area:"+c2.getArea());
		System.out.println("\tsurface area:"+c2.getSurfaceArea());
		System.out.println("\tLateral Surface Area:"+c2.getLateralSurfaceArea());
		System.out.println("\tvolume:"+c2.getVolume());
	}
}

class Circle{
	private float radius;

	public Circle(){}

	public Circle(float radius){
		this.radius = radius;
		System.out.println("i am in Circle(float) constructor!");
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public float getArea(){
		//π× (radius)²
		return (float)(Math.PI*radius*radius);
	}

	public float getCircumference(){
		// 2π x radius
		return (float) (2*Math.PI*radius);
	}

	public float getDiameter(){
		//2 x radius
		return (float)(2*radius);
	}
}

class Cylinder extends Circle{

	private float height;

	public Cylinder(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius:");
		super.setRadius(sc.nextFloat());
		System.out.print("enter height:");
		height = sc.nextFloat();
	}

	public Cylinder(float radius, float height) {
		super(radius);
		this.height = height;
	}

	public float getHeight() {
		return height;
	}


	public float getSurfaceArea() {
		//A=2πrh+2πr2 = 2πr(h+r)
		return (float) (2*Math.PI*this.getRadius()*(height + this.getRadius()));
	}

	public float getLateralSurfaceArea(){
		//AL=2πrh
		return (float) (2*Math.PI*this.getRadius()*height);
	}

	public float getVolume(){
		//V=πr^2h
		return (float) (Math.PI*this.getRadius()*this.getRadius()*height);
	}
}











