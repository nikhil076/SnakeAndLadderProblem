package com.bridgelabz;

public class SnakeAndLadder {

	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	
	public static void main(String args[]) {
		
			System.out.println("Welcome to snake and ladder ");
			int player1_starting_position = 0;
			int player2_starting_position = 0;
			int count_of_player1_dice_roll = 0;
			int count_of_player2_dice_roll = 0;
			
			while(player1_starting_position<100 && player2_starting_position<100)
			{
				// for player one
				double player1_dice_roll = Math.floor(Math.random() * 10 ) % 6;
				player1_dice_roll+=1;
				
				double player1_option = Math.floor(Math.random() * 10 ) % 3;
			
				switch ((int)player1_option) {
					case LADDER : 
						player1_starting_position+=player1_dice_roll;
						if((int)player1_starting_position > 100) {
							player1_starting_position=(int) (player1_starting_position-player1_dice_roll);
						}
						System.out.println("Player 1 has got ladder and position now is :"+player1_starting_position);
						count_of_player1_dice_roll++;
						break;
						
					case SNAKE :
						player1_starting_position = (int) (player1_starting_position-player1_dice_roll) ;
						if(player1_starting_position < 0) {
							player1_starting_position=0;
						}
						break;
					
					default:
						break;
					}
				// for player two
				double player2_dice_roll = Math.floor(Math.random() * 10 ) % 6;
				player2_dice_roll+=1;
//				System.out.println(PLAYER2_DICE_ROLL);
				
				double player2_option = Math.floor(Math.random() * 10 ) % 3;
//				System.out.println(PLAYER2_OPTIONS);
			
				switch ((int)player2_option) {
					case LADDER : 
						player2_starting_position+=player2_dice_roll;
						if((int)player2_starting_position > 100) {
							player2_starting_position=(int) (player2_starting_position-player2_dice_roll);
						}
						System.out.println("player 2 has got ladder and position now is :"+player2_starting_position);
						count_of_player2_dice_roll++;
						break;
						
					case SNAKE :
						player2_starting_position = (int) (player2_starting_position-player2_dice_roll) ;
						if(player2_starting_position < 0) {
							player2_starting_position=0;
						}
						break;
					
					default:
						break;
					}
			}
			if (player1_starting_position == 100)
			{
				System.out.println("Player 1 has won the game");
			}
			else
				System.out.println("Player 2 has won the game");
	}
}
