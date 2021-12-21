/*
Java Exercise 3: Guess the Number (OOPs Edition)
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */
package com.day5.p3;

import java.util.Random;
import java.util.Scanner;

public class Day5Ch9L43 {
	public static void main(String...args){
		System.out.println("Hello Welcome to \"Guess the Number\" Game!");
		Game g = new Game();
		g.startGame();
	}
}

class Game{
	private int randNum;
	private int userGuessedNum;
	private int noOfGuessesCount;

	//constructor to generate a random number
	Game(){
		this.noOfGuessesCount = 0;
	}

	//methods
	public void startGame(){
		Random r = new Random();
		this.randNum = r.nextInt(0,100);
		takeUserInput();
		while (!isCorrectNumber()){
			System.out.println("Sorry Your Guess Was Wrong!");
			if(randNum < userGuessedNum)
				System.out.println("The Generated Number Is Less Than "+userGuessedNum);
			else
				System.out.println("The Generated Number Is More Than "+userGuessedNum);
			takeUserInput();
		}
		System.out.println("\t\tGenerated Number:"+randNum+"\n\t\tYour Guessed Number:"+userGuessedNum);
		System.out.println("\t\tNumber Of Guesses You Took:"+noOfGuessesCount);
	}

	private void takeUserInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Guess Which Number Is Generated:");
		this.userGuessedNum = sc.nextInt();
		this.noOfGuessesCount++;
	}

	private boolean isCorrectNumber(){
		if(randNum == userGuessedNum){
			return true;
		}
		else
			return false;
	}


}












