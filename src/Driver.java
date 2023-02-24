import java.util.Scanner;

public class Driver {

	static Scanner keyboard;

	public static void main(String[] args) {
		ChoicesUser();

	}

	private static void ChoicesUser() {
		keyboard = new Scanner(System.in);
		int answer = 0;
		
		while (answer != 8) {
			
			System.out.println("Press 1 --- New Game");
			System.out.println("Press 2 --- Simulate one quarter");
			System.out.println("Press 3 --- Print current score");
			System.out.println("Press 4 --- Print current prediction");
			System.out.println("Press 5 --- Print prediction stats");
			System.out.println("Press 6 --- Print table results finished games");
			System.out.println("Press 7 --- Print new piece title with results");
			System.out.println("Press 8 --- Quit");

			answer = keyboard.nextInt();

			if (answer == 1) {

			}
			if (answer == 2) {

			}
			if (answer == 3) {

			}
			if (answer == 4) {

			}
			if (answer == 5) {

			}
			if (answer == 6) {

			}
			if (answer == 7) {

			}

		}
	}

}
