
import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner textIn = new Scanner(System.in);
		String playAgain = "";
		do {
			String colour = "";
			System.out.println( "Please enter a colour." );
			colour = textIn.next();
			String pastTenseVerb = "";
			System.out.println( "Please enter a past tense verb.");
			pastTenseVerb = textIn.next();
			String adjective = "";
			System.out.println( "Please enter an adjective." );
			adjective = textIn.next();
			String noun = "";
			System.out.println( "Please enter a noun.");
			noun = textIn.next();
			System.out.println( "Your Madlib is:");
			System.out.print( "The " + colour + " dragon " + pastTenseVerb + " at the " + adjective );
			System.out.println( "knight, who rode on a sturdy, giant " + noun + "." );
			System.out.println( "Would you like to play again? (y/n)" );
			playAgain = textIn.next();
		} while (playAgain.equalsIgnoreCase( "y" ));
		System.out.println( "Thank you for playing, goodbye." );
		textIn.close();

	}

}
