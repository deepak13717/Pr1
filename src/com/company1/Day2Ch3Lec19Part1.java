/*
What will be the output of this program:

int a = 10;
if (a=11)
        System.out.println(“I am 11”);
else
        System.out.println(“I am not 11”);
 */
package com.company1;

public class Day2Ch3Lec19Part1 {
    public static void main(String[] args){
        System.out.println("hello world!");
        int a = 10;
        if (a==11)//a=11:compile time error:incompatible types: int cannot be converted to boolean
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");
    }
}
