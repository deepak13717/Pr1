/*
Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
 */
package com.company;

//import statements
import java.lang.String;

public class Ch2PrQ2 {
    public static void main(String[] args){
        System.out.println("Hello welcome to encryption & decryption!");
        char grade = 'a';
        grade += 8;//encryption
        System.out.println(grade+" "+(int)grade);
        grade -= 8;//decryption
        System.out.println(grade+" "+(int)grade);
    }
}
