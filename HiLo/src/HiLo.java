
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			// Create a random number for the player to guess.
			int theNumber = (int)( Math.random() * 100 + 1 );
			// System.out.println( theNumber );
			int guess = 0;
			int numberTries =0;
			while ( guess != theNumber) {
				System.out.println( "Guess a number between 1 and 100." );
				guess = scan.nextInt();
				numberTries = numberTries + 1;
				System.out.println( "Guess Number: " + numberTries );
				// System.out.println( "You guessed " + guess + "." );
				if ( guess < theNumber )
					System.out.println( "Your guess is too low, try again.");
				else if ( guess > theNumber )
					System.out.println( "Your guess is too high, try again.");
				else
					System.out.println( guess + " is correct! You got it " + numberTries + " attempts! The number was " + theNumber + "." );

			}	// End of while loop for guessing.
			System.out.println( "Would you like to play again? (y/n)" );
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase( "y" ));
		System.out.println( "Thank you for playing, goodbye." );
		scan.close();

	}

}
