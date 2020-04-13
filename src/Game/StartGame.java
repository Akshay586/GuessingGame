package Game;

import java.util.Scanner;


public class StartGame {
	
	int guessLimit;
	int targetDigit;
	int count=0;
	public void host()
	{
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Alright players guess a digit...");
		System.out.print("What's the guess Limit?");
		guessLimit = sc.nextInt();
		System.out.println("I`m guessing a digit between 0 and "+guessLimit+"...");
		
		targetDigit=(int) (Math.random()*guessLimit);
		Player player = new Player();
		int playerGuess = 0;
		
		
		while(true) {
			playerGuess = player.play();
			if(playerGuess==targetDigit) {
				System.out.println("Congratulations, you win!");
				break;
			}
			else {
				System.out.println("Sorry that guess was incorrect, try again!");
				
				count=count+1;
				if (count==3)
				{
					System.out.println("Sorry, you`re out of guesses");
		            break;
				}
			}
		}
		
		
	}

	public static void main(String args[]) {
		StartGame sg = new StartGame();
		sg.host();
	}
}
