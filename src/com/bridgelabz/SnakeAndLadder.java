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
				
				double PLAYER1_OPTIONS = Math.floor(Math.random() * 10 ) % 3;
			
				switch ((int)PLAYER1_OPTIONS) {
				case LADDER : 
					PLAYER1_STARTING_POSITION+=PLAYER1_DICE_ROLL;
					if((int)PLAYER1_STARTING_POSITION > 100) {
						PLAYER1_STARTING_POSITION=(int) (PLAYER1_STARTING_POSITION-PLAYER1_DICE_ROLL);
					}
					System.out.println("Player 1 has got ladder and position now is :"+PLAYER1_STARTING_POSITION);
					COUNT_OF_PLAYER1_DICE_ROLL++;
					break;
					
				case SNAKE :
					PLAYER1_STARTING_POSITION = (int) (PLAYER1_STARTING_POSITION-PLAYER1_DICE_ROLL) ;
					if(PLAYER1_STARTING_POSITION < 0) {
						PLAYER1_STARTING_POSITION=0;
					}
					break;
				
				default:
					break;
				}
				// for player two
				double PLAYER2_DICE_ROLL = Math.floor(Math.random() * 10 ) % 6;
				PLAYER2_DICE_ROLL+=1;
//				System.out.println(PLAYER2_DICE_ROLL);
				
				double PLAYER2_OPTIONS = Math.floor(Math.random() * 10 ) % 3;
//				System.out.println(PLAYER2_OPTIONS);
			
				switch ((int)PLAYER2_OPTIONS) {
				case LADDER : 
					PLAYER2_STARTING_POSITION+=PLAYER2_DICE_ROLL;
					if((int)PLAYER2_STARTING_POSITION > 100) {
						PLAYER2_STARTING_POSITION=(int) (PLAYER2_STARTING_POSITION-PLAYER2_DICE_ROLL);
					}
					System.out.println("player 2 has got ladder and position now is :"+PLAYER2_STARTING_POSITION);
					COUNT_OF_PLAYER2_DICE_ROLL++;
					break;
					
				case SNAKE :
					PLAYER2_STARTING_POSITION = (int) (PLAYER2_STARTING_POSITION-PLAYER2_DICE_ROLL) ;
					if(PLAYER2_STARTING_POSITION < 0) {
						PLAYER2_STARTING_POSITION=0;
					}
					break;
				
				default:
					break;
				}
			}
			if (PLAYER1_STARTING_POSITION == 100)
			{
				System.out.println("Player 1 has won the game");
			}
			else
				System.out.println("Player 2 has won the game");
	}
}
