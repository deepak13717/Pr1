/*
    Write a program to calculate the percentage of a given student in the CBSE board exam.
    His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
 */
package com.company;

//import statements
import java.lang.String;
import java.util.Scanner;
import java.lang.System;

public class CbseBoardPercentageCalculator {
    public static void main(String[] args){
        System.out.println("Hello CBSE Board!");
        Scanner sc = new Scanner(System.in);
        String studentName;
        float mathsMarks,phyMarks,chemMarks,sanskritMarks,hindiMarks;
        System.out.print("\n\tEnter student name:");
        studentName = sc.nextLine();
        System.out.println("Hello "+studentName+", have a good day!");
        System.out.println("Enter the marks obtained by "+studentName+" in the following Subject.");
        System.out.print("\n\tMaths marks(out of 100):");
        mathsMarks = sc.nextFloat();
        System.out.print("\n\tPhysics marks(out of 100):");
        phyMarks = sc.nextFloat();
        System.out.print("\n\tChemistry marks(out of 100):");
        chemMarks = sc.nextFloat();
        System.out.print("\n\tSanskrit marks(out of 100):");
        sanskritMarks = sc.nextFloat();
        System.out.print("\n\tHindi marks(out of 100):");
        hindiMarks = sc.nextFloat();
        float percentage = (mathsMarks + phyMarks + chemMarks + sanskritMarks + hindiMarks)/5.0f;
        System.out.println("\n\t"+studentName+" has obtained "+percentage+"% marks in the CBSE Board Exam!");
        float cgpa = (mathsMarks + phyMarks + chemMarks + sanskritMarks + hindiMarks)/50;
        System.out.println("\n\tcgpa : "+cgpa);
    }
}
