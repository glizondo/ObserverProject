import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	static Scanner keyboard;
	static KeepTrackScore keepTrackScore;
	static PredictFinalGame predictFinalGame;
	static NewsTitleGenerator news;
	static Scoring score;

	public static void main(String[] args) {
		ChoicesUser();
	}

	private static void ChoicesUser() {

		keyboard = new Scanner(System.in);
		keepTrackScore = new KeepTrackScore();
		predictFinalGame = new PredictFinalGame();
		news = new NewsTitleGenerator();

		int answer = 0;
		while (answer != 9) {

			System.out.println("Press 1 --- New Game");
			System.out.println("Press 2 --- Start quarter");
			System.out.println("Press 3 --- Finish and simulate quarter");
			System.out.println("Press 4 --- Print current score");
			System.out.println("Press 5 --- Print current prediction in percentage based on current result of game");
			System.out.println(
					"Press 6 --- Print random simulation final result (only available at the starting of the game or 1st quarter)");
			System.out.println("Press 7 --- Print table results finished games");
			System.out.println("Press 8 --- Print new piece title with results");
			System.out.println("Press 9 --- Quit");

			answer = keyboard.nextInt();

			if (answer == 1) {
				Game game = new Game();
				ArrayList<Team> teamsPlaying = new ArrayList<>();
				teamsPlaying = game.getTeamsPlaying();

				Team team1 = teamsPlaying.get(0);
				Team team2 = teamsPlaying.get(1);

				score = new Scoring(team1, team2);

				score.registerObserver(predictFinalGame);
				score.registerObserver(keepTrackScore);
				score.registerObserver(news);
				score.notifyObservers();
			}
			if (answer == 2) {
				score.startQuarter();
			}
			if (answer == 3) {
				score.simulateQuarter();
			}
			if (answer == 4) {
				keepTrackScore.displayCurrentScore();
			}
			if (answer == 5) {
				predictFinalGame.displayPercentageFinalResultBasedOnCurrentScore();
			}
			if (answer == 6) {
				predictFinalGame.displaySimulationPredictionGame();
			}
			if (answer == 7) {
				keepTrackScore.displayAllScoresFinishedGames();
			}
			if (answer == 8) {
				news.displayNewsTitleBasedOnScore();
			}

		}
	}

}
