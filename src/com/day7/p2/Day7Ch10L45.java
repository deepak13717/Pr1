package com.day7.p2;

import java.util.Locale;

public class Day7Ch10L45 {
	public static void main(String...args){
		System.out.println("Hello welcome to Inheritance!");
		Dog d1 = new Dog();
		System.out.println("life type:"+d1.getLifeType());
		System.out.println("----------------------");
		Animal a1 = new Dog(8);
		System.out.println("life type:"+a1.getLifeType());//run time polymorphism or dynamic method dispatch
		//System.out.println("voice:"+a1.voice());//compile time error
	}
}

class Animal{
	Animal(){
		System.out.println("I am in Animal() constructor!");
	}

	Animal(int a){//constructor overloading -- compile time polymorphism
		System.out.println("I am in Animal(int) constructor!\n\ta:"+a);
	}

	String getLifeType(){
		return "Animal";
	}
}

class Mammal extends Animal{
	String animalType;
	Mammal(){
		super(7);
		System.out.println("I am in Mammal() constructor!");
	}

	Mammal(int a){
		System.out.println("I am in Mammal(int) constructor!\n\ta:"+a);
	}

	String getLifeType(){
		return "Animal-Mammal";
	}

	String voice(){
		return "some sound";
	}
}

class Dog extends Mammal{
	private String name;
	Dog(){
		super(4);
		System.out.println("I am in Dog() constructor!");
	}

	Dog(int a){
		System.out.println("I am in Dog(int) constructor!\n\ta:"+a);
	}

	Dog(String name){
		this.name = name;
		super.animalType = "Mammal";
		System.out.println("life type:"+super.getLifeType());
		System.out.println("animal type:"+super.animalType.toUpperCase(Locale.ROOT));
		System.out.println("I am in Dog(String) constructor!\n\tname:"+this.name);
	}

	String getLifeType(){
		return "Animal-Mammal-Dog";
	}

	String voice(){
		return "barking";
	}
}