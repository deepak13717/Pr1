/*
Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%
Note that there is no tax below 2.5L. Take the input amount as input from the user.
 */
package com.company1;

import java.util.Scanner;

public class Day2Ch3Lec19Part3 {
    public static void main(String[] args){
        System.out.println("Hello world!");
        float income,tax=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your annual salary in lakhs:");
        income = sc.nextFloat();
        if(income > 2.5 && income <= 5.0){
            tax += 0.05*income;
            System.out.println("\ttax on you:"+tax);
        }else if(income > 5.0 && income <= 10.0){
            tax += 0.05*(5.0 - 2.5);
            tax += 0.2*(income - 5.0);
            System.out.println("\ttax on you:"+tax);
        }else if (income > 10.0){
            tax += 0.05*(5.0 - 2.5);
            tax += 0.2*(10.0 - 5.0);
            tax += 0.3*(income - 10.0);
            System.out.println("\ttax on you:"+tax);
        }else
            System.out.println("\tno tax for you!");
    }
}
