/*
Question 1: Write a program to print the following pattern :

****

***

**

*
--------------
Question 2: Write a program to sum first n even numbers using a while loop.
----------------
Question 3: Write a program to print the multiplication table of a given number n.
-----------------
Question 4: Write a program to print a multiplication table of 10 in reverse order.
------------------
Question 5: Write a program to find the factorial of a given number using for loops.
-------------------
Question 6: Repeat problem 5 using a while loop.
-------------------

 */
package com.day3;

import java.util.Scanner;

public class Day3Ch5L25Q1 {
	public static void main(String[] args){
		System.out.println("Hello world!");
		Scanner sc = new Scanner(System.in);

/*		//q1
		for (byte i = 4; i >= 1; i--,System.out.println()){
			for (byte j = 1; j <= i; j++){
				System.out.print("*");
			}
		}
		//q2
		int n,sum=0,k=0;
		System.out.print("enter a natural number:");
		n = sc.nextInt();
		while (k < n){
			sum += k*2;
		}
		System.out.println("sum of first "+n+" even numbers:"+sum);

		//q3
		System.out.print("enter a natural number:");
		short s = sc.nextShort();
		System.out.println("multiplication table for number "+s+":");
		for (short a = 1; a <= 10; a++){
			System.out.println("\t"+s+" * "+a+" = "+(s*a));
		}

		//q4
		System.out.println("multiplication table for 10 in reverse order:");
		for (short a = 10; a >= 1; a--){
			System.out.println("\t10 * "+a+" = "+(10*a));
		}

		//q5
		System.out.print("enter a natural number:");
		int b = sc.nextInt(),fact=1;
		for (int c = b; c >= 1; c--){
			fact *= c;
		}
		System.out.print("factorial of number "+b+":"+fact);
*/
		//q6
		System.out.print("enter a natural number:");
		int d = sc.nextInt(),fact1=1;
		int cc = d;
		while (cc >= 1){
			fact1 *= cc;
			cc--;
		}
		System.out.print("factorial of number "+d+":"+fact1);
	}
}














