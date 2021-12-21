package com.company1;

//import statements
import java.lang.String;
import java.lang.System;
import java.util.Locale;
import java.util.Scanner;

public class Day2Ch3Lec14 {
    public static void main(String[] args){
        System.out.println("Hello welcome to String methods!");
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tenter a string:");
        str = sc.nextLine();
        System.out.println("\tinputStr:"+str);
        try {
            System.out.println("\tstr length:"+str.length());
            System.out.println("\tstrToLowerCase:"+str.toLowerCase());
            System.out.println("\tstrToUpperCase:"+str.toUpperCase());
            System.out.println("\tstrAfterTrim:"+str.trim());
            System.out.println("\tstrSubstring:"+str.substring(4));
            System.out.println("\tstrSubstring:"+str.substring(4,8));
            System.out.println("\tstrReplace:"+str.replace('e','i'));
            System.out.println("\tstrStartsWith:"+str.startsWith("De"));
            System.out.println("\tstrEndsWith:"+str.endsWith("mar"));
            System.out.println("\tstrCharAt:"+str.charAt(3));
            System.out.println("\tstrIndexOf:"+str.indexOf("ak"));
            System.out.println("\tstrIndexOf:"+str.indexOf("ak",3));
            System.out.println("\tstrLastIndexOf:"+str.lastIndexOf("a"));
            System.out.println("\tstrLastIndexOf:"+str.lastIndexOf("a",6));
            System.out.println("\tstrEquals:"+str.equals("Deepak Kumar"));
            System.out.println("\tstrEqualsIgnoreCase:"+str.equalsIgnoreCase("deepak kumar"));
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("\tinputStr:"+str);
    }
}
