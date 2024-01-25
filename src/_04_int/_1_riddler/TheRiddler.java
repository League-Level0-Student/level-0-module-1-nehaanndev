package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		String answerTravel = "stamp";
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String guess = JOptionPane.showInputDialog("What has traveled the world while sitting in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (guess.equals(answerTravel)) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score + " point(s).");
		}else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer was" + answerTravel + ".");
		}
		String answerKeys = "piano";
		guess = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");
		if (guess.equals(answerKeys)) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score + " point(s).");
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer was" + answerKeys);
		}
	String answerFence = "fence";
	guess = JOptionPane.showInputDialog("What runs all around a backyard, yet never moves?");
	if (guess.equals(answerFence)) {
		score += 1;
		JOptionPane.showMessageDialog(null, "Correct! Your score is " + score +  " point(s).");
		
	}else {
		JOptionPane.showMessageDialog(null, "Wrong! The answer was" + answerFence);
	}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

