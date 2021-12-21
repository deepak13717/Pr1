/*
Q1)Write a Java method to print the multiplication table of a number n.
Q2)Write a program using functions to print the following pattern:
      *

     **

    ***

   ****
Q3)Write a recursive function to calculate the sum of first n natural numbers.
Q4)Write a function to print the following pattern:
    ****

    ***

    **

    *
Q5)Write a function to print the nth term of the Fibonacci series using recursion.
Q6)Write a function to find the average of a set of numbers passed as arguments.
Q7)Repeat problem 4 using Recursion.
Q8)Repeat problem 2 using Recursion.

 */
package com.day5;


import java.util.Scanner;

public class Day5Ch7L35Q1 {
	public static void main(String... args){
		System.out.println("Hello world!");
		//q1();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		//q7();
		q8();
	}

	static void q8(){
		//Repeat problem 2 using Recursion.
		printPattern2((byte) 1);
	}

	private static void printPattern2(byte n){
		//specially designed for printing the given pattern only
		if(n != 5){
			for(byte b = 1; b <= (4-n); b++){
				System.out.print(" ");
			}
			for(byte b = 1; b <= n; b++){
				System.out.print("*");
			}
			System.out.println();
			printPattern2((byte)(n + 1));
		}
	}

	static void q7(){
		//Repeat problem 4 using Recursion.
		printPattern1(4);
	}

	private static void printPattern1(int num){
		if(num > 0){
			for (byte b = 1; b <= num; b++){
				System.out.print("*");
			}
			System.out.println();
			printPattern1(num-1);
		}
	}

	static void q6(){
		//Write a function to find the average of a set of numbers passed as arguments.
		Scanner sc = new Scanner(System.in);
		System.out.print("how many numbers do you want to enter:");
		int[] numArray = new int[sc.nextInt()];
		System.out.println("Please enter "+numArray.length+" numbers:");
		for (byte b = 0; b < numArray.length; b++){
			System.out.print("\t\tnumber"+(b+1)+" : ");
			numArray[b] = sc.nextInt();
		}
		System.out.println("average of "+numArray.length+" numbers : "+averageNumbers(numArray));
	}


	static float averageNumbers(int... arr){
		float avg = 0;
		for (float num : arr) {
			avg += num;
		}
		return avg/arr.length;
	}

	static void q5(){
		//Write a function to print the nth term of the Fibonacci series using recursion.
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the term of the fibonacci series you want:");
		byte term = sc.nextByte();
		if(term == 1)
			System.out.println(term+"th term of fibonacci series:"+0);
		else if (term == 2)
			System.out.println(term+"th term of fibonacci series:"+1);
		else
			System.out.println(term+"th term of fibonacci series:"+nthTermOfFibonacciSeries(0,1,(byte) (term-2)));
	}

	private static long nthTermOfFibonacciSeries(long first, long second, byte term) {
		if(term == 1)
			return first + second;
		else
			return nthTermOfFibonacciSeries(second,first + second,(byte) (term - 1));
	}

	static void q4(){
		for (byte a = 0; a < 4; a++,System.out.println()){
			for (byte b = (byte)(4-a); b > 0; b--){
				System.out.print("*");
			}
		}
	}

	static void q3(){
		//Write a recursive function to calculate the sum of first n natural numbers.
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n:");
		int n = sc.nextInt();
		System.out.println("sum of first "+n+" natural numbers :"+sumOfFirstN_NaturalNumbers(n));
	}

	private static int sumOfFirstN_NaturalNumbers(int n) {
		if (n == 1)
			return 1;
		else
			return n + sumOfFirstN_NaturalNumbers(n-1);
	}

	static void q2(){
		for (byte a = 1; a <= 4; a++,System.out.println()){
			for (byte b = (byte)(4-a); b > 0; b--){
				System.out.print(" ");
			}
			for (byte b = 1; b <= a; b++){
				System.out.print("*");
			}
		}
	}

	static void q1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number whose multiplication table you want to print:");
		short num = sc.nextShort();
		System.out.println("\tMultiplication Table for "+num+":");
		for (byte b = 1; b <= 10; b++){
			System.out.println("\t\t"+num+" * "+b+" = "+(b*num));
		}
	}
}












