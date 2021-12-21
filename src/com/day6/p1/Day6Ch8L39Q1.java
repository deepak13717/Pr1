/*
Q1)Create a class Employee with the following properties and methods:
	Salary (property) (int)
	getSalary (method returning int)
	name (property) (String)
	getName (method returning String)
	setName (method changing name)
Q2)Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
Q3)Create a class Square with a method to initialize its side, calculating area, perimeter etc.

 */
package com.day6.p1;

import java.util.Scanner;

public class Day6Ch8L39Q1 {
	public static void main(String...args){
		System.out.println("Hello world!");
		//q1();
		//q2();
		q3();
	}

	static void q3(){
		//Create a class Square with a method to initialize its side, calculating area, perimeter etc.
		Scanner sc = new Scanner(System.in);
		Square s1 = new Square();
		System.out.print("enter length of square's side:");
		s1.setLength(sc.nextFloat());
		System.out.println("\tlength of side of square: "+s1.getLength());
		System.out.println("\tperimeter of square:"+s1.calculatePerimeter());
		System.out.println("\tarea of square:"+s1.calculateArea());
	}

	static void q2(){
		CellPhone c1 = new CellPhone();
		c1.ring();
		c1.vibrate();
	}

	static void q1(){
		Employee e1 = new Employee();
		e1.setName("Deepak Kumar");
		System.out.println("e1.salary:"+e1.getSalary()+"\ne1.name:"+e1.getName());
	}
}

class Square{
	private float length;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float calculatePerimeter(){
		return this.length * 4;
	}

	public float calculateArea(){
		return this.length * this.length;
	}
}

class CellPhone{
	//member methods
	public void ring(){
		System.out.println("Ringing...");
	}

	public void vibrate(){
		System.out.println("Vibrating...");
	}
}

class Employee{
	//member attributes
	private int salary;
	private String name;

	//member methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}
}