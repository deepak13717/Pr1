/*
Rock paper scissors (also known by other orderings of the three items, with "rock"
sometimes being called "stone", or as Rochambeau, roshambo, or ro-sham-bo)[1][2][3] is a
hand game, usually played between two people, in which each player simultaneously forms one of
three shapes with an outstretched hand. These shapes are "rock" (a closed fist), "paper" (a flat hand), and
 "scissors" (a fist with the index finger and middle finger extended, forming a V). "Scissors" is identical
 to the two-fingered V sign (also indicating "victory" or "peace") except that it is pointed horizontally
 instead of being held upright in the air.

A simultaneous, zero-sum game, it has three possible outcomes: a draw, a win or a loss. A player who decides
 to play rock will beat another player who has chosen scissors ("rock crushes scissors" or sometimes "blunts
  scissors"[4]), but will lose to one who has played paper ("paper covers rock"); a play of paper will lose
  to a play of scissors ("scissors cuts paper"). If both players choose the same shape, the game is tied and
   is usually immediately replayed to break the tie. The type of game originated in China and spread with
   increased contact with East Asia, while developing different variants in signs over time.

   GamePlay:
   ---------
   ->The players may count aloud to three, or speak the name of the game (e.g. "Rock! Paper! Scissors!"),
        either raising one hand in a fist and swinging it down with each syllable or holding it behind their
        back. They then "throw" by extending it towards their opponent. Variations include a version where
        players throw immediately on the third count (thus throwing on the count of "Scissors!"), or a version
        where they shake their hands three times before "throwing"
 */
package com.day3;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
	public static void main(String[] args){
		System.out.println("Hello world welcome to \"Rock! Paper! Scissors!\" Game");
		/*
		1->rock,2->paper,3->scissor
		 */
		String player1Name="computer",player2Name;
		byte player1Input,player2Input;
		byte player1Points=0,player2Points=0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("\tenter your name:");
		player2Name = sc.nextLine();
		System.out.println("\n\tIt is a 5 match series!");
		for (int i = 1; i<=5; i++){
			System.out.println("\n\tMatch"+i+"\n\t------");
			System.out.print("\t\t"+player2Name+" choose from options:\n\t\t1.rock\n\t\t2.paper\n\t\t3" +
					".scissor\n\t\toption:");
			player2Input = sc.nextByte();
			player1Input = (byte) r.nextInt(1,4);
			if (player1Input == player2Input){
				System.out.println("\n\tmatch"+i+" is a draw between "+player1Name+" and "+player2Name);
			} else if((player1Input ==1 && player2Input ==2) || (player1Input ==2 && player2Input ==3) ||
					(player1Input ==3 && player2Input ==1)){
				player2Points++;
				System.out.println("\n\tmatch"+i+":"+player2Name+" won!");
			}else{//(player1Input ==1 && player2Input ==3) || (player1Input ==2 && player2Input ==1)
				// || (player1Input ==3 && player2Input ==2)
				player1Points++;
				System.out.println("\n\tmatch"+i+":"+player1Name+" won!");
			}
		}
		System.out.println("\n\twinner:"+((player1Points > player2Points)?player1Name:player2Name));
	}
}













