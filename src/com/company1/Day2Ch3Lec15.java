/*
->Write a Java program to convert a string to lowercase.
->Write a Java program to replace spaces with underscores.
->Write a Java program to fill in a letter template which looks like below:
    // letter = “Dear <|name|>, Thanks a lot”

    // Replace <|name|> with a string (some name)
->Write a Java program to detect double and triple spaces in a string.
->Write a program to format the following letter using escape sequence characters.
 */
package com.company1;

import java.util.Scanner;

public class Day2Ch3Lec15 {
    public static void main(String[] args){
        System.out.println("Hello welcome to the world of string methods!");
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("\tenter a string:");
        str = sc.nextLine();
        System.out.println("\tstr:"+str);
        try {
            System.out.println("\tstrLowerCase:"+str.toLowerCase());
            System.out.println("\tstrReplaceSpaceWith_:"+str.replace(' ','_'));
            String letter = "Dear <|name|>, Thanks a lot";
            String strToBeReplaced = "<|name|>";
            String strWithToReplace;
            System.out.println("\tletterTemplate:"+letter);
            System.out.print("\tenter a name:");
            strWithToReplace = sc.nextLine();
            letter = letter.replace(strToBeReplaced,strWithToReplace);
            System.out.println("\tletterTemplate after nameFill:"+letter);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("\tstr:"+str);
    }
}
