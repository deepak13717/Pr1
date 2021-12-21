/*
Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.
What is a leap year?
To be a leap year, the year number must be divisible by four – except for end-of-century years, which
must be divisible by 400. This means that the year 2000 was a leap year, although 1900 was not.
 */
package com.company1;

import java.util.Scanner;

public class Day2Ch3Lec19Part5 {
	public static void main(String[] args){
		System.out.println("hello world!");
		Scanner sc = new Scanner(System.in);
		short year;
		System.out.print("\n\tenter year:");
		year = sc.nextShort();
		if(year%100 == 0){
			//end-of-century year
			if (year%400 == 0){
				System.out.print("\t"+year+" is a leap year!");
			}else {
				System.out.print("\t"+year+" is not a leap year!");
			}
		}else if (year%4 == 0){
			System.out.print("\t"+year+" is a leap year!");
		}else
			System.out.print("\t"+year+" is not a leap year!");
	}
}
