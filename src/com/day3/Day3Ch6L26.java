/*
Quick Quiz: Write a Java program to print the elements of an array in reverse order.
-------------------------------
 */
package com.day3;

import java.util.Scanner;

public class Day3Ch6L26 {
	public static void main(String[] args){
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5];//marks=reference, new int[5] = object
		System.out.println("enter marks for 5 subjects:");
		for (byte b = 0; b < marks.length; b++){
			System.out.print("sub"+(b+1)+":");
			marks[b] = sc.nextInt();
		}
		System.out.println("marks in 5 subjects:");
		for (byte b = 0; b < marks.length; b++){
			System.out.println("sub"+(b+1)+" marks:"+marks[b]);
		}
		System.out.println("marks in 5 subjects:");
		for (int mark: marks) {
			System.out.println(mark);
		}
		System.out.println("marks in 5 subjects in reverse order:");
		for (byte b = (byte)(marks.length-1); b >= 0; b--){
			System.out.println("sub"+(b+1)+" marks:"+marks[b]);
		}
	}
}
