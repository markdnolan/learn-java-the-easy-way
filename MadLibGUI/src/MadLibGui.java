import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MadLibGui extends JFrame {
	private JTextField inputAdjective;
	private JTextField inputVerb;
	private JTextField inputColour;
	private JTextField inputNoun;
	private JTextArea outputSentence;

	public void BuildMadLib() {
		String adjective = inputAdjective.getText();
		String verb = inputVerb.getText();
		String colour = inputColour.getText();
		String noun = inputNoun.getText();
		String sentence = "The " + colour + " dragon " + verb + " at the " + adjective  + " knight, who rode on a sturdy, giant " + noun + ".";
		outputSentence.setText( sentence );
		inputAdjective.requestFocus();
		inputAdjective.selectAll();

	}

	public MadLibGui() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Mark's Irritating Mad Libs App");
		getContentPane().setLayout(null);

		JLabel labelTitle = new JLabel("Mark's Irritating Mad Libs App");
		labelTitle.setForeground(new Color(139, 0, 0));
		labelTitle.setFont(new Font("PT Serif", Font.PLAIN, 16));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 6, 438, 35);
		getContentPane().add(labelTitle);

		inputAdjective = new JTextField();
		inputAdjective.setHorizontalAlignment(SwingConstants.LEFT);
		inputAdjective.setFont(new Font("Arial", Font.PLAIN, 12));
		inputAdjective.setColumns(10);
		inputAdjective.setBounds(137, 53, 110, 26);
		getContentPane().add(inputAdjective);

		inputVerb = new JTextField();
		inputVerb.setFont(new Font("Arial", Font.PLAIN, 12));
		inputVerb.setHorizontalAlignment(SwingConstants.LEFT);
		inputVerb.setColumns(10);
		inputVerb.setBounds(137, 91, 110, 26);
		getContentPane().add(inputVerb);

		inputColour = new JTextField();
		inputColour.setHorizontalAlignment(SwingConstants.LEFT);
		inputColour.setFont(new Font("Arial", Font.PLAIN, 12));
		inputColour.setColumns(10);
		inputColour.setBounds(334, 53, 110, 26);
		getContentPane().add(inputColour);

		inputNoun = new JTextField();
		inputNoun.setHorizontalAlignment(SwingConstants.LEFT);
		inputNoun.setFont(new Font("Arial", Font.PLAIN, 12));
		inputNoun.setColumns(10);
		inputNoun.setBounds(334, 91, 110, 26);
		getContentPane().add(inputNoun);

		JLabel labelAdjective = new JLabel("Enter an adjective:");
		labelAdjective.setFont(new Font("Arial", Font.PLAIN, 12));
		labelAdjective.setBounds(6, 58, 129, 16);
		getContentPane().add(labelAdjective);

		JLabel labelVerb = new JLabel("Enter a past tense verb:");
		labelVerb.setFont(new Font("Arial", Font.PLAIN, 12));
		labelVerb.setBounds(6, 96, 129, 16);
		getContentPane().add(labelVerb);

		JLabel labelColour = new JLabel("Enter a colour:");
		labelColour.setFont(new Font("Arial", Font.PLAIN, 12));
		labelColour.setBounds(249, 58, 93, 16);
		getContentPane().add(labelColour);

		JLabel labelNoun = new JLabel("Enter a noun:");
		labelNoun.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNoun.setBounds(249, 96, 105, 16);
		getContentPane().add(labelNoun);

		outputSentence = new JTextArea();
		outputSentence.setLineWrap(true);
		outputSentence.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		outputSentence.setBounds(6, 173, 438, 93);
		getContentPane().add(outputSentence);

		JButton buttonCreate = new JButton("Press here to create your sentence");
		buttonCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent createButtonPressed) {
				BuildMadLib();
			}
		});
		buttonCreate.setBounds(6, 129, 438, 29);
		getContentPane().add(buttonCreate);
	}

	public static void main(String[] args) {
		MadLibGui theGame = new MadLibGui();
		theGame.setSize(new Dimension( 450,300 ) );
		theGame.setVisible( true );

	}
}
