package com.day3;

import java.util.Random;

public class Day3Ch4 {
	public static void main(String[] args){
		System.out.println("Hello World!");
		Random r = new Random();
		int a = r.nextInt();
		System.out.println(a);
		a = r.nextInt(10);
		System.out.println(a);
		a = r.nextInt(1, 4);
		System.out.println(a);
	}
}
