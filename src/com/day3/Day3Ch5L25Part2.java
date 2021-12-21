/*
----------------------------
Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
---------------------------
Question 11: Repeat problem 2 using for loop.
---------------------------
 */
package com.day3;

import java.util.Scanner;

public class Day3Ch5L25Part2 {
	public static void main(String[] args){
		System.out.println("HelloWorld!");
		Scanner sc = new Scanner(System.in);
/*
		//q9
		short sum = 0;
		System.out.println("multiplication table for number 8:");
		for (short a = 1; a <= 10; a++){
			sum += 8*a;
			System.out.println("\t8 * "+a+" = "+(8*a));
		}
		System.out.println("the sum of the numbers occurring in the multiplication table of 8:"+sum);
*/
		//q11
		int n,sum=0,k=0;
		System.out.print("enter a natural number:");
		n = sc.nextInt();
		for (k = 0; k < n; k++){
			sum += k*2;
		}
		System.out.println("sum of first "+n+" even numbers:"+sum);
	}
}











