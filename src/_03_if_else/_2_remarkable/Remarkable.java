package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String fictionBooks ="There are 8 differnet types of fiction";
	String slime ="There are many differnet types of slime and more are being made everyday.";
	String games ="Roblox is one of the most played games ever.";
	String mAndms ="Soliders ate them during WII.";
	String toostieRolls ="An airdrop that was supposed to be filled not with ammunition,contained actual Tootsie Rolls.";
	String tongueBurns ="If you burn your tongue, the taste buds will heal within a week or two.";

	// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog("Choose a topic from: Fiction Books,Slime,Games,M&MS,Toostie Rolls, and Tongue Burns"); 
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (input.equals("Fiction Books")) {
			JOptionPane.showMessageDialog(null, fictionBooks);
		}else if (input.equals("Slime")) {
			JOptionPane.showMessageDialog(null, slime);
		}else if (input.equals("Games")) {
			JOptionPane.showMessageDialog(null, games);
		}else if (input.equals("M&MS")) {
			JOptionPane.showMessageDialog(null, mAndms);
		}else if (input.equals("Toostie Rolls")) {
			JOptionPane.showMessageDialog(null, toostieRolls);
		}else if (input.equals("Toostie Rolls")) {
			JOptionPane.showMessageDialog(null, toostieRolls);
		}else if (input.equals("Tongue Burns")) {
			JOptionPane.showMessageDialog(null, tongueBurns);
		}
	}
}

