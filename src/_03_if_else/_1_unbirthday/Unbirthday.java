package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
	String todaysDate = "1/10";
	String userInput = JOptionPane.showInputDialog("Whats your birthday? Enter it in the month/day format.");
		if (userInput.equals(todaysDate)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
	}
}
