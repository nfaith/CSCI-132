

/*
 * How to play Nim:
 * The game is played with two players that alternately take marbles from a pile. In each
 * move, a player chooses how many marbles to take. The player must take at least one
 * but at most half of the marbles. Then the other players takes a turn. The player who
 * takes the last marble loses.
 * 
 * Instructions for the class Nim:
 * 
 * Generate a random integer between 10 and 100 to represent the original stack
 *  of marbles.
 * Generate another random number between 0 and 1 to determine who goes first,
 *  computer or player.
 * Generate another random number between 0 and 1 to determine if the computer
 *  plays smart or stupid.
 *        * In stupid mode the computer simply takes a random number of marbles
 *          between 1 and n/2 (n being the total marbles).
 *          
 *        * In smart mode the computer takes off enough marbles to make the size
 *          of the pile a power of two minus 1 -- that is 3, 7, 15, 31 or 63. (example
 *          2^2 - 1 = 3 and 2^3 - 1 = 7 and 2^4 - 1 = 15). This will always work
 *          unless the pile is 1 less than power of 2, so in that case the computer will
 *          take a random legal move
 * 
 */

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Nim {
	
	Random r = new Random();
	int numberMarbles = r.nextInt((100 -10) +1)+ 10;
	
/*
 * This is the constructor method for the class Nim.
 */
	public Nim() {

		int computerDifficulty = r.nextInt(2);	
		boolean continues = true;
		boolean bad_input = true;
		
		System.out.println("Welcome to the Game of Nim! ");
		System.out.println("---------------------------- ");
		System.out.println("There are " + numberMarbles +" marbles to start with.");
		int first = r.nextInt(2);

		if( computerDifficulty == 0) {
			System.out.println("Computer is playing in smart mode.");
		} else {
			System.out.println("Computer is playing in stupid mode.");
		}
		if(first == 0) {
			System.out.println("Computer goes first.");
			int toTake = computerPlay(computerDifficulty);
			numberMarbles -= toTake;
			System.out.println("There are "+ numberMarbles + " marbles left.");
			System.out.println(" ");
		}
		
		
		do {
			bad_input = true;
			do { 
			
				System.out.println("How many marbles ");
				Scanner sc = new Scanner(System.in);
				int numMarblesWanted = sc.nextInt();

				if ( numMarblesWanted <= numberMarbles ) {
				
					if(numMarblesWanted > (numberMarbles/2)) {
						System.out.println("You can not choose a number that is greater than half the marbles."); 
						
					
					} else if(numMarblesWanted == 0) {
						System.out.println("You must take a number of marbles. ");
					
					} else {
						numberMarbles -= numMarblesWanted;
						bad_input = false;
					}
				} else if(numberMarbles == 1) {
					continues = false;
				} else {
					System.out.println("You can not choose a number that is greater than half the marbles.");

				}
			}while(bad_input);
			if(numberMarbles <= 1) {
				System.out.println("Player wins.");
				continues = false;
			}else {	
				int toTake = computerPlay(computerDifficulty);
				numberMarbles -= toTake;
				System.out.println("There are "+ numberMarbles + " marbles left.");
				System.out.println(" ");
				if(numberMarbles <= 1) {
					System.out.println("Computer wins.");
					continues = false;
				}
			} 
			
			

		}while(continues);
		
	}
	
	/*
	 *        * In stupid mode the computer simply takes a random number of marbles
	 *          between 1 and n/2 (n being the total marbles).
	 *          
	 *        * In smart mode the computer takes off enough marbles to make the size
	 *          of the pile a power of two minus 1 -- that is 3, 7, 15, 31 or 63. (example
	 *          2^2 - 1 = 3 and 2^3 - 1 = 7 and 2^4 - 1 = 15). This will always work
	 *          unless the pile is 1 less than power of 2, so in that case the computer will
	 *          take a random legal move
	 */
	public int computerPlay(int difficulty) {
		int numberToTake = 0;
		if (difficulty == 1) {
			if(numberMarbles > 3) {
				numberToTake = r.nextInt(((numberMarbles/2) - 1)) + 1;
			}else if(numberMarbles >= 2 ) {
				numberToTake = 1;
			}else {
				numberToTake = 0;
			}
		} else {
			int exponent = 6;
			boolean more = true;
			while(more){
				int answer = (int)(Math.pow(2, exponent)-1);
				if (answer < numberMarbles ) {
					if ((numberMarbles - (numberMarbles - answer )) <= (numberMarbles / 2)) {
						numberToTake = numberMarbles - answer;
						more = false;
					}
				} 
				exponent--;
				if (exponent == 0){
					if(numberMarbles > 3) {
						more = false;
						numberToTake = r.nextInt(((numberMarbles/2) - 1)) + 1;
					}else if(numberMarbles >= 2) {
						numberToTake = 1;
					} else {
						numberToTake = 0;
					}
				}
			}

		}
		System.out.println("Computer takes "+ numberToTake +" marbles.");
		return numberToTake;
	}
	


}
