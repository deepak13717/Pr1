/*
Write a Java program to convert Kilometers to miles.
 */
package com.company;

//import statements
import java.lang.String;
import java.util.Scanner;

public class KiloMeterToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Welcome to KiloMeterToMiles Calculator!");
        System.out.println("\n\tEnter distance in KiloMeter:");
        float km = sc.nextFloat();
        //1 kilometer (km) = 0.62137 miles (mi)
        float miles = 0.62137f*km;
        System.out.println("\n\t"+km+" Kilometer = "+miles+" miles!");
    }
}
