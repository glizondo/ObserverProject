import java.util.Scanner;

public class Driver {

	static Scanner keyboard;
	static boolean wantsToKeepPlaying;

	public static void main(String[] args) {
		ChoicesUser();
		
		
		
	}

	private static void ChoicesUser() {
		keyboard = new Scanner(System.in);

		System.out.println("Press 1 --- New Game");
		System.out.println("Press 2 --- Simulate one quarter");
		System.out.println("Press 3 --- Print current score");
		System.out.println("Press 4 --- Print current prediction");
		System.out.println("Press 5 --- Print prediction stats");
		System.out.println("Press 6 --- Print table results finished games");



		int answer = keyboard.nextInt();

		while (answer != 4) {
			if (answer == 1) {

			}
			if (answer == 2) {

			}
			if (answer == 3) {

			}

		}
	}

}
