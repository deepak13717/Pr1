/*
Question 4: Write a Java program to find out the day of the week given the
number [1 for Monday, 2 for Tuesday … and so on!]
 */
package com.company1;

import java.util.Scanner;

public class Day2Ch3Lec19Part4 {
    public static void main(String[] args){
        System.out.println("hello world!");
        Scanner sc = new Scanner(System.in);
        byte day;
        System.out.print("\n\tenter today's day:\n\t1.monday\n\t2.tuesday\n\t3.wednesday\n\t4.thursday\n\t5" +
                ".friday\n\t6.saturday\n\t7.sunday\n\tday:");
        day = sc.nextByte();
        switch (day){//enhanced switch
            case 1 -> System.out.println("today is monday!");
            case 2 -> System.out.println("today is tuesday!");
            case 3 -> System.out.println("today is wednesday!");
            case 4 -> System.out.println("today is thursday!");
            case 5 -> System.out.println("today is friday!");
            case 6 -> System.out.println("today is saturday!");
            case 7 -> System.out.println("today is sunday!");
            default -> System.out.println("wrong input.");
        }
    }
}
