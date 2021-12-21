/*
Q5)Write a Java program to reverse an array.
Q6)Write a Java program to find the maximum element in an array.
Q7)Write a Java program to find whether an array is sorted or not.

 */
package com.day4;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

public class Day4Ch6L29Q5 {
	public static void main(String[] args){
		System.out.println("Hello world!");
		int []arr;//array declaration only
		arr = inputIntArray();//method call
		//question5(arr);
		//question6(arr);
		question7(arr);
	}

	static void question7(int[] arr){
		boolean isSorted = true;
		System.out.println("array elements:");
		displayIntArray(arr);//method call
		for (byte b = 0; b < arr.length-1; b++){
			if(arr[b] > arr[b+1]){
				isSorted = false;
				break;
			}
		}
		if(!isSorted)
			System.out.println("the given array is not sorted!");
		else
			System.out.println("the given array is sorted!");
	}

	static void question6(int[] arr){
		int maxElement = 0;
		//System.out.println("Integer.MIN_VALUE:"+Integer.MIN_VALUE);
		//System.out.println("Integer.MAX_VALUE:"+Integer.MAX_VALUE);
		System.out.println("array elements:");
		displayIntArray(arr);//method call
		for (byte b = 0; b < arr.length; b++){
			if (arr[b] > maxElement){
				maxElement = arr[b];
			}
		}
		System.out.println("Maximum element in the array:"+maxElement);
	}

	static void question5(int[] arr) {
		System.out.println("array elements before reversing the array are:");
		displayIntArray(arr);//method call
		//reverse the array
		revIntArray(arr);//method call
		System.out.println("array elements after reversing the array are:");
		displayIntArray(arr);//method call
	}

	static void inputIntArrayRandom(int[] arr) {
		Random r = new Random();
		//System.out.println("enter " + arr.length + " integers:");
		for (byte i = 0; i < arr.length; i++) {
			//System.out.print("arr[" + i + "]:");
			arr[i] = r.nextInt();//sc.nextInt();
		}
	}

	static void inputIntArrayUserInput(int[] arr) {
		System.out.println("enter " + arr.length + " integers:");
		Scanner sc = new Scanner(System.in);
		for (byte i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]:");
			arr[i] = sc.nextInt();
		}
	}

	static int @NotNull [] inputIntArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array:");
		int[] arr = new int[sc.nextByte()];//array declaration + array memory allocation only
		byte opt ;
		do{
			System.out.print("Input from\n\t1.random values\n\t2.user input\n\toption:");
			opt = sc.nextByte();
			switch (opt){
				case 1 -> inputIntArrayRandom(arr);
				case 2 -> inputIntArrayUserInput(arr);
				default -> System.out.println("sorry wrong option! please enter a valid option!");
			}
		}while (opt != 1 && opt != 2);
		return arr;
	}

	static void displayIntArray(int @NotNull [] arr){
		for (int element:arr) {
			System.out.println(element);
		}
	}

	static void revIntArray(int @NotNull [] arr){
		for(byte i = 0, j = (byte) (arr.length-1); i < j; i++,j--){
			/*
			logic for swapping two variables a and b using ^(bitwise exclusive or) operator
			a^b=c;c^b=a;c^a=b;
			a=a^b; b= a^b; a= a^b;
			 */
			arr[i] = arr[i] ^ arr[j];
			arr[j] = arr[i] ^ arr[j];
			arr[i] = arr[i] ^ arr[j];
		}
	}
}
