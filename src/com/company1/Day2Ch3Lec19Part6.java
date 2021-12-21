/*
Question 6:Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.in – Indian website
-------------------------------------
my solution:
------------
->find the index of last (.) before url ends or last(.) before first(/) in the url
->find the string after (.) index
->compare the string with .com,.org,.in using switch case statements
 */
package com.company1;

import java.util.Scanner;

public class Day2Ch3Lec19Part6 {
	public static void main(String[] args){
		System.out.println("hello world!");
		Scanner sc = new Scanner(System.in);
		String url,urlType;
		System.out.print("enter url:");
		url = sc.nextLine();
		/*
		byte indexOfLastDotInUrl = (byte) url.lastIndexOf('.');
		urlType = url.substring(indexOfLastDotInUrl);
		switch (urlType){
			case ".com" -> System.out.println("it is a commercial website!");
			case ".org" -> System.out.println("it is a organization website!");
			case ".in" -> System.out.println("it is a Indian website!");
			default -> System.out.println("it is a unknown website!");
		}*/
		//using if
		if(url.endsWith(".com"))
			System.out.println("it is a commercial website!");
		else if (url.endsWith(".org"))
			System.out.println("it is a organization website!");
		else if (url.endsWith(".in"))
			System.out.println("it is a Indian website!");
		else
			System.out.println("it is a unknown website!");
	}
}





