/*
Q1)Create an array of 5 floats and calculate their sum
Q2)Write a program to find out whether a given integer is present in an array or not.
Q3)Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
Q4)Create a Java program to add two matrices of size 2x3.

 */
package com.day3;

import java.util.Scanner;

public class Day3Ch6L29Q1 {
	public static void main(String[] args){
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
/*
		//Q1
		float[] income = new float[5];
		System.out.println("enter income of 5 employees:");
		float sum = 0;
		for (byte b = 0; b < income.length; b++) {
			System.out.print("income of employee"+(b+1)+":");
			income[b] = sc.nextFloat();
			sum += income[b];
		}
		System.out.println("income of 5 employees:");
		for (float inc:income) {
			System.out.println(inc);
		}
		System.out.println("sum of incomes of 5 employees:"+sum);

		//Q2
		int[] numbers = {43,34,39,43,54,45,232,788,787};
		int num;
		System.out.print("enter an integer:");
		num = sc.nextInt();
		byte bb;
		for ( bb = 0; bb < numbers.length; bb++) {
			if(num == numbers[bb]){
				System.out.println("the integer:"+num+" is present in the array!");
				break;
			}
		}
		if (bb == numbers.length)
			System.out.println("the integer:"+num+" is not present in the array!");

		//Q3
		int []marks = {34,45,54,65,37,87,98,57,78,55,66,84,62};
		float avgMarks = 0;
		for (int mark:marks) {
			avgMarks += mark;
		}
		avgMarks = avgMarks/(float) marks.length;
		System.out.println("average marks of "+marks.length+" students:"+avgMarks);
*/
		//Q4
		int[][] matrix1 , matrix2, sumMatrix;//declaration
		matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}};//memory allocation + initialization
		matrix2 = new int[][]{{2,3,4},{5,6,7}};//memory allocation + initialization
		sumMatrix = new int[2][3];//memory allocation
		System.out.println("matrix1.length:"+matrix1.length+"\nmatrix2.length:"+matrix2.length);
		System.out.println("matrix1[0].length:"+matrix1[0].length+"\nmatrix2[0].length:"+matrix2[0].length);
		for (byte i = 0; i < sumMatrix.length; i++){
			for (byte j = 0; j < sumMatrix[i].length; j++){
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("the matrix1:");
		for (byte i = 0; i < matrix1.length; i++,System.out.println()){
			for (byte j = 0; j < matrix1[i].length; j++){
				System.out.print(" "+matrix1[i][j]);
			}
		}
		System.out.println("the matrix2:");
		for (byte i = 0; i < matrix2.length; i++,System.out.println()){
			for (byte j = 0; j < matrix2[i].length; j++){
				System.out.print(" "+matrix2[i][j]);
			}
		}
		System.out.println("the sumMatrix:");
		for (byte i = 0; i < sumMatrix.length; i++,System.out.println()){
			for (byte j = 0; j < sumMatrix[i].length; j++){
				System.out.print(" "+sumMatrix[i][j]);
			}
		}
	}
}
