package com.bridgelabz;

public class SnakeAndLadder {

	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	
	public static void main(String args[]) {
		
			System.out.println("Welcome to snake and ladder ");
			int PLAYER1_STARTING_POSITION = 0;
			int PLAYER2_STARTING_POSITION = 0;
			int COUNT_OF_PLAYER1_DICE_ROLL = 0;
			int COUNT_OF_PLAYER2_DICE_ROLL = 0;
			
			while(PLAYER1_STARTING_POSITION<100 && PLAYER2_STARTING_POSITION<100)
			{
				// for player one
				double PLAYER1_DICE_ROLL = Math.floor(Math.random() * 10 ) % 6;
				PLAYER1_DICE_ROLL+=1;
				System.out.println(PLAYER1_DICE_ROLL);
				
				double PLAYER1_OPTIONS = Math.floor(Math.random() * 10 ) % 3;
				System.out.println(PLAYER1_OPTIONS);
			
				switch ((int)PLAYER1_OPTIONS) {
				case LADDER : 
					PLAYER1_STARTING_POSITION+=PLAYER1_DICE_ROLL;
					if((int)PLAYER1_STARTING_POSITION > 100) {
						PLAYER1_STARTING_POSITION=(int) (PLAYER1_STARTING_POSITION-PLAYER1_DICE_ROLL);
					}
					System.out.println("Player 1 has won and position now is :"+PLAYER1_STARTING_POSITION);
					COUNT_OF_PLAYER1_DICE_ROLL++;
					break;
					
				case SNAKE :
					PLAYER1_STARTING_POSITION = (int) (PLAYER1_STARTING_POSITION-PLAYER1_DICE_ROLL) ;
					if(PLAYER1_STARTING_POSITION < 0) {
						PLAYER1_STARTING_POSITION=0;
					}
					System.out.println("Snake has occured and new position is "+PLAYER1_STARTING_POSITION);
					break;
				
				default:
					System.out.println("No play has occured , no chanage in position");
					break;
				}
				// for player two
				double PLAYER2_DICE_ROLL = Math.floor(Math.random() * 10 ) % 6;
				PLAYER2_DICE_ROLL+=1;
				System.out.println(PLAYER2_DICE_ROLL);
				
				double PLAYER2_OPTIONS = Math.floor(Math.random() * 10 ) % 3;
				System.out.println(PLAYER2_OPTIONS);
			
				switch ((int)PLAYER2_OPTIONS) {
				case LADDER : 
					PLAYER2_STARTING_POSITION+=PLAYER2_DICE_ROLL;
					if((int)PLAYER2_STARTING_POSITION > 100) {
						PLAYER2_STARTING_POSITION=(int) (PLAYER2_STARTING_POSITION-PLAYER2_DICE_ROLL);
					}
					System.out.println("player 2 has won and position now is :"+PLAYER2_STARTING_POSITION);
					COUNT_OF_PLAYER2_DICE_ROLL++;
					break;
					
				case SNAKE :
					PLAYER2_STARTING_POSITION = (int) (PLAYER2_STARTING_POSITION-PLAYER2_DICE_ROLL) ;
					if(PLAYER2_STARTING_POSITION < 0) {
						PLAYER2_STARTING_POSITION=0;
					}
					System.out.println("Snake has occured and new position is "+PLAYER2_STARTING_POSITION);
					break;
				
				default:
					System.out.println("No play has occured , no chanage in position");
					break;
				}
			}
		System.out.println("Number of time player 1 dice is rolled to win is "+COUNT_OF_PLAYER1_DICE_ROLL);
		System.out.println("Number of time player 2 dice is rolled to win is "+COUNT_OF_PLAYER2_DICE_ROLL);
	}
}
