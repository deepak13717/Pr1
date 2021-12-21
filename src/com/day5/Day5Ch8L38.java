package com.day5;

import java.util.Scanner;

public class Day5Ch8L38 {
	public static void main(String... args){
		System.out.println("Hello Welcome to classes!");
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.print("enter employee id:");
		e1.setId(sc.nextInt());
		System.out.print("enter employee name:");
		e1.setName(sc.nextLine());
		e1.printDetails();
	}
}

class Employee{
	int id;
	String name;
	void printDetails(){
		System.out.println("Employee id:"+id);
		System.out.println("Employee Name:"+name);
	}

	void setId(int i) {
		id = i;
	}

	 void setName(String name) {
		this.name = name;
	}
}













