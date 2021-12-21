/*
Q1)create a class cylinder and use getter and setters to set its radius and height
Q2)use ➊ to calculate surface and volume of the cylinder
	->A=2πrh+2πr^2
	->V=πr^2h
Q3)Use a constructor and repeat ➊
Q4)Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
Q5)Repeat ➊ for a sphere

 */

package com.day6.p1;

//import statements

import java.util.Scanner;

public class Day6Ch9L44Q1 {
	public static void main(String...args){
		System.out.println("Hello welcome to chapter 9 practice questions!");
		//q1();
		//q3();
		//q4();
		q5();
	}

	static void q5(){
		//Repeat ➊ for a sphere
		Sphere s1 = new Sphere();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius of sphere:");
		s1.setRadius(sc.nextFloat());
		System.out.println("\tradius:"+s1.getRadius());
		System.out.println("\tsurface area of sphere:"+s1.getSurfaceArea());
		System.out.println("\tvolume of sphere:"+s1.getVolume());
		System.out.println("--------------------------------------------------");
		System.out.print("enter radius of sphere:");
		Sphere s2 = new Sphere(sc.nextFloat());
		System.out.println("\tradius:"+s2.getRadius());
		System.out.println("\tsurface area of sphere:"+s2.getSurfaceArea());
		System.out.println("\tvolume of sphere:"+s2.getVolume());
	}

	static void q4(){
		//Overload a constructor used to initialize a rectangle
		// of length and breath 5 for using custom parameters
		Rectangle r1 = new Rectangle();
		System.out.println("\tr1.length:"+r1.getLength()+"\n\tr1.breadth:"+r1.getBreadth());
		System.out.println("--------------------------------------------------");
		Rectangle r2 = new Rectangle(4.4f,6.6f);
		System.out.println("\tr2.length:"+r2.getLength()+"\n\tr2.breadth:"+r2.getBreadth());
		System.out.println("--------------------------------------------------");
	}

	static void q3() {
		//Use a constructor and repeat ➊
		Cylinder c1 = new Cylinder(3.4f,4.5f);
		System.out.println("c1.radius:"+c1.getRadius()+"\nc1.height:"+c1.getHeight());
	}

	static void q1(){
		Cylinder c1 = new Cylinder();
		c1.setRadius(5.5f);
		c1.setHeight(6.7f);
		System.out.println("c1.radius:"+c1.getRadius()+"\nc1.height:"+c1.getHeight());
		float radius = c1.getRadius();
		float height = c1.getHeight();
		//q2----------------------------
		float surfaceArea = (float) (2*Math.PI*radius*(height + radius));//A=2πrh+2πr^2 = 2πr(h+r)
		float volume = (float)(Math.PI*radius*radius*height) ; //V=πr^2h = πrrh = π*r*r*h
		System.out.println("\n\tsurface area of cylinder:"+surfaceArea+"\n\tvolume of cylinder:"+volume);
	}
}

class Cylinder{
	private float radius;
	private float height;

	Cylinder(){
		System.out.println("in Cylinder() constructor!");
	}

	Cylinder(float radius, float height){
		this.radius = radius;
		this.height = height;
		System.out.println("in Cylinder(f,f) constructor!");
	}

	public float getHeight() {//getters or accessors
		return height;
	}

	public void setHeight(float height) {//setters or mutators
		this.height = height;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
}

class Rectangle{
	private float length;
	private float breadth;

	Rectangle(){
		this.length = 4.2f;
		this.breadth = 5.5f;
	}

	Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}
}

class Sphere{
	private float radius;

	//constructor overloading
	Sphere(){
		System.out.println("i am in Sphere() constructor!");
	}

	Sphere(float radius){
		this.radius = radius;
		System.out.println("i am in Sphere(float) constructor!");
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	//use ➊ to calculate surface and volume of the Sphere
	public float getSurfaceArea(){
		//Surface area: 4πr2
		return (float)(4*Math.PI*radius*radius);
	}

	public float getVolume(){
		//Volume: (4/3) × π × r³
		return (float)((4/3.0)*Math.PI*radius*radius*radius);
	}
}