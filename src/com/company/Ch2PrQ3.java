/*
Use comparison operators to find out whether a given number is greater than the user entered number or not.
 */
package com.company;

//import statement
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Ch2PrQ3 {
    public static void main(String []args){
        System.out.println("Hello welcome to comparison operators!");
        int givenNum = 67;
        int userNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer:");
        userNum = sc.nextInt();
        System.out.println(givenNum>userNum);
    }
}
