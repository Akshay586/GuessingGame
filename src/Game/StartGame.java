package Game;

import java.util.Scanner;


public class StartGame {
	
	int guessLimit;
	int targetDigit;
	int count=0;
	boolean won=false;
	public void host()
	{
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Alright players guess a digit...");
		System.out.print("What's the guess Limit?");
		guessLimit = sc.nextInt();
		System.out.println("I`m guessing a digit between 0 and "+guessLimit+"...");
		
		targetDigit=(int) (Math.random()*guessLimit);
		System.out.println(targetDigit); //TODO remove this line
		Player player = new Player();
		Player player2=new Player();
		int playerGuess = 0;
		int playerGuess2 = 0;
		
		
		/*
		 * while(true) { playerGuess = player.play(); playerGuess2 = player2.play();
		 * if(playerGuess==targetDigit) {
		 * System.out.println("Congratulations,you win! player 1");
		 * 
		 * break; } else if(playerGuess2==targetDigit) {
		 * System.out.println("Congratulations,you win! player 2"); break; } else {
		 * System.out.println("Sorry that guess was incorrect, try again!");
		 * 
		 * count++; if (count==3) { System.out.println("Sorry, you`re out of guesses");
		 * break; } } }
		 */
		
		for(int i=0;i<3;i++) {
			playerGuess = player.play();
			playerGuess2 = player2.play();
			if(playerGuess==targetDigit) {
				System.out.println("Congratulations,you win! player 1");
				won=true;
				break;
			}
			else if(playerGuess2==targetDigit)
			{
				System.out.println("Congratulations,you win! player 2");
				won=true;
				break;
			}
			else {
				System.out.println("Sorry that guess was incorrect, try again!");
			}
		}
		
		if(!won) {
			System.out.println("You could not guess correctly");
		}
		
		System.out.println("Game Over!");
		
	}

	public static void main(String args[]) {
		StartGame sg = new StartGame();
		sg.host();
	}
}
