package com.day4;

import java.util.Scanner;

public class Day4Ch7L34 {
	public static void main(String ...args){
		System.out.println("Hello Welcome to recursion!");
		Scanner sc = new Scanner(System.in);

		/*
		//factorial
		int num;
		System.out.print("enter a natural number whose factorial you want:");
		num = sc.nextInt();
		System.out.println(num+"! = "+factorial(num));//method call
		*/
		//fibonacci series
		System.out.print("enter up to how many terms you want to print the fibonacci series:");
		int terms = sc.nextInt();
		int first = 0,second = 1;
		System.out.println("fibonacci series up to "+terms+" terms!:");
		System.out.print("\t"+first+" "+second);
		fibonacci(first,second,terms-2);//method call
	}

	static void fibonacci(int first,int second,int terms){
		if(terms > 0){
			System.out.print(" "+(first+second));
			fibonacci(second,first+second, terms-1);
		}
	}

	static long factorial(int num){
		if(num == 1 || num == 0)
			return 1;
		else return num*factorial(num-1);
	}
}
