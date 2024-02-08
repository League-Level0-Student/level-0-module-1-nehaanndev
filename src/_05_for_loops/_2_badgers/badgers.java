package _05_for_loops._2_badgers;

public class badgers {
	public static void main(String[] args) {

		for (int totalcounter = 1; totalcounter <= 2; totalcounter += 1) {

			for (int counter = 1; counter <= 12; counter += 1) {
				System.out.print("Badger");
			}
			System.out.println();
			for (int counter = 1; counter <= 2;counter += 1) {
				System.out.print(" Mushroom ");
			}
			System.out.println();
		}
		 System.out.println("Snake!");
	}
}