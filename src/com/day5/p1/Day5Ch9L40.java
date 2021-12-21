package com.day5.p1;

public class Day5Ch9L40 {
	public static void main(String... args){
		System.out.println("Hello Welcome to access level modifiers and getter and setter methods!");
		Employee e1 = new Employee();
		e1.setName("Deepak Kumar");
		e1.setId(101);
		System.out.println("e1.name:"+e1.getName());
		System.out.println("e1.id:"+e1.getId());
	}
}

class Employee{
	private int id;//only within the class 'Employee' private members are accessible
	private String name;

	//setters or mutators
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	//getters or accessors
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}















