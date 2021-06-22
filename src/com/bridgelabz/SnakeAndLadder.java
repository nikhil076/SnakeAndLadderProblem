package com.bridgelabz;

public class SnakeAndLadder {

	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	
	public static void main(String args[]) {
		
			System.out.println("Welcome to snake and ladder ");
			int PLAYER1_STARTING_POSITION = 0;
			
			while(PLAYER1_STARTING_POSITION<100)
			{
				double DICE_ROLL = Math.floor(Math.random() * 10 ) % 6;
				DICE_ROLL+=1;
				System.out.println(DICE_ROLL);
				
				double OPTIONS = Math.floor(Math.random() * 10 ) % 3;
				System.out.println(OPTIONS);
			
				switch ((int)OPTIONS) {
				case LADDER : 
					PLAYER1_STARTING_POSITION+=DICE_ROLL;
					if((int)PLAYER1_STARTING_POSITION > 100) {
						PLAYER1_STARTING_POSITION=(int) (PLAYER1_STARTING_POSITION-DICE_ROLL);
					}
					System.out.println("Ladder has occured and position now is :"+PLAYER1_STARTING_POSITION);
					break;
					
				case SNAKE :
					PLAYER1_STARTING_POSITION = (int) (PLAYER1_STARTING_POSITION-DICE_ROLL) ;
					if(PLAYER1_STARTING_POSITION < 0) {
						PLAYER1_STARTING_POSITION=0;
					}
					System.out.println("Snake has occured aand new position is "+PLAYER1_STARTING_POSITION);
					break;
				
				default:
					System.out.println("No play has occured , no chanage in position");
					break;
				}
			}
	}
}
