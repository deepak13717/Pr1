/*
->program to print natural numbers from 100 to 200 using while loop
->program to print first n natural numbers using do-while loop
->program to print first n odd numbers using for loop
->program to print first n natural numbers in reverse order
 */
package com.day3;

import java.util.Scanner;

public class Day3Ch5 {
	public static void main(String[] args){
		System.out.println("Hello World!");
		short i=100;
		while ( i <= 200){
			System.out.println(i++);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a natural number:");
		int n = sc.nextInt();
		int j=0;
		do {
			System.out.println(j++);
		}while (j <= n);

		System.out.println("first "+n+" odd natural numbers:");
		for (int k = 1,l=1; l <= n; l++,k += 2){
			System.out.println(k);
		}
		System.out.println("first "+n+" natural numbers in reverse order:");
		do {
			System.out.println(n--);
		}while (n > 0);
	}
}
