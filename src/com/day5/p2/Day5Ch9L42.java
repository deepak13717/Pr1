package com.day5.p2;

public class Day5Ch9L42 {
	public static void main(String... args){
		System.out.println("Hello welcome to constructors!");
		Employee e1 = new Employee();
		Employee e2 = new Employee(2,"Deepak Sharma");
		Employee e3 = new Employee(3,"Deepak Kumar",4,5,6,7,8,9,3432,434,3);
		System.out.println("\te1.id:"+e1.getId()+"\n\te1.name:"+e1.getName());
		System.out.println("\te1.id:"+e2.getId()+"\n\te1.name:"+e2.getName());
	}
}

class Employee{
	//private members are accessible only within the class
	private int id;
	private String name;

	//constructors
	Employee(){
		id = 1;
		name = "Emp_Name";
	}

	//constructor overloading
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, int...arr){
		this.id = id;
		this.name = name;
		for (int i:arr) {
			System.out.println(i);
		}
	}

	//getters or accessors
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}












