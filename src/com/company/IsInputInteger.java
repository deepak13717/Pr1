/*
Write a Java program to detect whether a number entered by the user is an integer or not.
 */

package com.company;

//import statements
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;

public class IsInputInteger {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello welcome to IsInputInteger!");
        System.out.println("\tEnter an integer:");
        System.out.println(sc.hasNextInt());
    }
}
