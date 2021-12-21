/*
Question 2: Write a program to find out whether a student is pass or fail;
 if it requires a total of 40% and at least 33% in each subject to pass.
 Assume 3 subjects and take marks as input from the user.
 */
package com.company1;

import java.util.Scanner;

public class Day2Ch3Lec19Part2 {
    public static void main(String[] args){
        System.out.println("hello world!");
        float s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subj1Marks(out of 100):");
        s1 = sc.nextFloat();
        System.out.println("enter subj2Marks(out of 100):");
        s2 = sc.nextFloat();
        System.out.println("enter subj2Marks(out of 100):");
        s3 = sc.nextFloat();
        if(s1 >= 33 && s2 >= 33 && s3 >= 33){
            float totalPer;
            totalPer = (s1 + s2 + s3)/3;
            if(totalPer >= 40)
                System.out.println("\n\tthe student has passed with "+totalPer+"% in total");
            else
                System.out.println("\n\tthe student has failed with "+totalPer+"% in total");
        }
        else
            System.out.println("\n\tthe student has failed");
    }
}
