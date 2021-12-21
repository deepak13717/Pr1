package com.day4;

public class Day4Ch7L31 {
	public static void main(String[] args){
		System.out.println("Hello World!");
		int a = 10,b =23;
		Day4Ch7L31 obj = new Day4Ch7L31();
		int c = obj.add(a, b);
		System.out.println("c:"+c);
		System.out.println(obj.add(4,6));
	}

	 int add(int a, int b){
		return a+b;
	}
}
