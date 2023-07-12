package _03_print_and_popups._4_quiz_game;

import java.util.Random;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int		Score = 0;
int		Question = 0;
int		Effectivescore = Score/Question*100;
		// ASK A QUESTION AND CHECK THE ANSWER
		while(Question<5) {
				// 2.  Ask the user a question 
			String fma =	JOptionPane.showInputDialog(null, "What is the formula for force");
				// 3.  Use an if statement to check if their answer is correct
				if (fma.equals(("F=ma"))) {
					Score=+1;
					Question=+1;
				}
				else {
					Question=+1;
				}
				
				// 4.  if the user's answer was correct, add one to their score 
		
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
