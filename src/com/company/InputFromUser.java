package com.company;

//import statements
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        //input integer
        /*    System.out.print("Enter num1:");
        int num1 = sc.nextInt();//input int from keyboard
        System.out.print("Enter num2:");
        int num2 = sc.nextInt();
        System.out.println("the sum of "+num1+" + "+num2+":"+(num1+num2));
        */
        //input a word
        System.out.print("Enter a statement:");
        //String str = sc.next();
        //input a statement
        //String str = sc.nextLine();
        //System.out.println("the input string:"+str);
        boolean check = sc.hasNextLine();//check if there is any input from the user
        System.out.println(check);
    }
}
