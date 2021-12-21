/*
Q4)Write the following expression in a java program
    (v^2-u^2)/2as
Q5)Find the value of 'a' in expression given below :
    int x = 7
    int a = 7*49/7 + 35/7
 */
package com.company;

//import statements
import java.lang.String;
import java.lang.System;


public class Ch2PrQ4 {
    public static void main(String[] args){
        System.out.println("Hello welcome to the expressions and operators!");
        //Q1
        float b = 7/4 * 9/2;
        System.out.println(b);
        //Q4
        int v = 8, u =3, a =6,s=2;
        System.out.println((v*v-u*u)/(2*a*s));
        //Q5
        int x = 7;
        int k = 7*49/7 + 35/7;
        System.out.println(k);
    }
}
