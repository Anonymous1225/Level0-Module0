package _03_print_and_popups._4_quiz_game;

import java.util.Random;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int		Score = 0;
int		Question = 0;

		// ASK A QUESTION AND CHECK THE ANSWER

				// 2.  Ask the user a question 
			String fma =	JOptionPane.showInputDialog(null, "What is the formula for force?");
				// 3.  Use an if statement to check if their answer is correct
				if (fma.equals(("F=ma"))) {
                    JOptionPane.showMessageDialog(null, "Correct!");
					Score=+1;
					Question=+1;
				}
				else {
					JOptionPane.showMessageDialog(null, "Sorry, that was incorrect.");
					Question=+1;
				}
				
				// 4.  if the user's answer was correct, add one to their score 
		String math1 = JOptionPane.showInputDialog(null,"What is 4 times 3?");
		if (math1.equals("12")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score=+1;
			Question=+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was incorrect.");
			Question=+1;
		}
		String math2 = JOptionPane.showInputDialog("When did Christopher Columbus quote on quote becuase the java won't let me put quotations discover America ");
		if (math2.equals("1492")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score=+1;
			Question=+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was incorrect.");
		}
		String Math3=JOptionPane.showInputDialog(null,"What is 99 times 99");
		if (Math3.equals("9801")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score=+1;
			Question=+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was incorrect.");
			Question=+1;
		}
		String haha = JOptionPane.showInputDialog("When was minecraft created?");
		if (haha.equals("May 16 2009")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score=+1;
			Question=+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was incorrect.");
			Question=+1;
		}
		int		Effectivescore = Score/Question*100;
		JOptionPane.showMessageDialog(null,Effectivescore);
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}

