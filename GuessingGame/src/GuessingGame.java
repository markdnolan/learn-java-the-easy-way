import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField textGuess;
	private JLabel labelOutput;
	private JButton buttonPlayAgain;
	private int theNumber;
	private int numberOfTries;
	private String openingMessage = "Enter a number in the box above then click Guess.";
	
	public void checkGuess() {
		String guessText = textGuess.getText();
		String message = "";
		String attempts = "You have ";
		try {
			int guess = Integer.parseInt(guessText);
			numberOfTries = numberOfTries + 1;
			attempts =  attempts + (8 - numberOfTries) + " tries left.";
			if ( guess < theNumber )
				message = guess + " is too low, try again." + attempts;
			else if ( guess > theNumber )
				message = guess + " is too high, try again." + attempts;
			else {
				message = guess + " is correct, well done! You took " + numberOfTries + " tries. Let's play again!";
				buttonPlayAgain.setVisible( true );
			}
		} catch (Exception badText) {
			message = "Enter a whole number bewteen 1 and 100. You still have " + (8 - numberOfTries) + " tries left.";
		} finally {
			if (numberOfTries > 7) {
				message = "Sorry you ran out of tries. Try again";
				buttonPlayAgain.setVisible( true );
			}
			labelOutput.setText(message);
			textGuess.requestFocus();
			textGuess.selectAll();
			}
	
	}
	
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1 );
		numberOfTries = 0;
		buttonPlayAgain.setVisible( false );
		labelOutput.setText( openingMessage );
		
	}
	
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mark's Hi-Lo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Mark's Hi-Lo Guessing Game");
		labelTitle.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(0, 38, 450, 21);
		getContentPane().add(labelTitle);
		
		JLabel labelIntruction = new JLabel("Guess a number between 1 and 100:");
		labelIntruction.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 13));
		labelIntruction.setHorizontalAlignment(SwingConstants.LEFT);
		labelIntruction.setBounds(6, 97, 243, 16);
		getContentPane().add(labelIntruction);
		
		textGuess = new JTextField();
		textGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent enterKeyPressed) {
				checkGuess();
			}
		});
		textGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		textGuess.setBounds(257, 92, 37, 26);
		getContentPane().add(textGuess);
		textGuess.setColumns(10);
		
		JButton buttonGuess = new JButton("Guess");
		buttonGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent guessButtonPressed) {
				checkGuess();
			}
		});
		buttonGuess.setBounds(166, 151, 117, 29);
		getContentPane().add(buttonGuess);
		
		buttonPlayAgain = new JButton("Play Again");
		buttonPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent playAgain) {
				newGame();
			}
		});
		buttonPlayAgain.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 13));
		buttonPlayAgain.setBounds(166, 177, 117, 29);
		getContentPane().add(buttonPlayAgain);
		
		labelOutput = new JLabel(  openingMessage );
		labelOutput.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 13));
		labelOutput.setHorizontalAlignment(SwingConstants.CENTER);
		labelOutput.setBounds(0, 218, 450, 16);
		getContentPane().add(labelOutput);
		
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension( 450,300 ) );
		theGame.setVisible( true );
	}
}
