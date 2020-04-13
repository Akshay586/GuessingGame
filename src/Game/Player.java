package Game;
import java.util.Scanner;

public class Player {
	Scanner sc= new Scanner (System.in);
	public int play()
	{
		System.out.print("Okay host my guess is :");
		int guessP1=sc.nextInt();
		return guessP1;
	}
	
}
