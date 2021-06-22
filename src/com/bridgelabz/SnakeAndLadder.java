package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String args[]) {
		System.out.println("Welcome to snake and ladder ");
		int PLAYER1_STARTING_POSITION = 0;
		
		double DiceRoll = Math.floor(Math.random() * 10 ) % 6;
		DiceRoll+=1;
		System.out.println(DiceRoll);
	}
}
