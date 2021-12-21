package com.company1;

//import statements
import java.lang.String;
import java.lang.System;
import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class Day2Ch3Lec13 {
    public static void main(String[] args){
        System.out.println("Hello welcome to the world of Strings in java!");
        String name ;
        name = new String("Deepak Kumar");
        System.out.print("the name is :");
        System.out.println(name);
        String name1 = "Deepak Sharma";
        try {
            System.out.printf("\n\tthe name is %s,and his age is %10.3f",name1,160f);
            System.out.format("my name is:%s, and my age is %4.5f",name,26f);
        }catch (IllegalFormatConversionException e){
            System.out.println("\n\terror:"+e.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n\tEnter a string:");
        name = sc.next();
        System.out.printf("str=%5.5s",name);
    }
}
