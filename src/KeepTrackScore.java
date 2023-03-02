import java.util.ArrayList;

public class KeepTrackScore implements Observer {
	private Team team1;
	private Team team2;
	ArrayList<Scoring> scoresTeams = new ArrayList<>();
	private int quarter;
	private boolean quarterIsFinished;

	@Override
	public void update(Team team1, Team team2, int quarter, boolean quarterIsFinished) {
		this.team1 = team1;
		this.team2 = team2;
		this.quarter = quarter;
		this.quarterIsFinished = quarterIsFinished;
		keepTrackAllScores();

	}

	public void display() {
		System.out.println("Current score in the game: " + team1.name + ": " + team1.score + " - " + team2.name + ": "
				+ team2.score + " Quarter: " + quarter + " Is finished: " + quarterIsFinished);
	}

	public void keepTrackAllScores() {
		if (quarter == 4 && quarterIsFinished) {
			scoresTeams.add(new Scoring(team1, team2, quarter, quarterIsFinished));

		}
	}

	public void showAllScoresFinishedGames() {
		if (!scoresTeams.isEmpty()) {
			System.out.println("Past results from games");
			for (Scoring a : scoresTeams) {
				System.out.println(a.getNameLocal() + ": " + a.getScoreLocal() + " - " + a.getNameVisitant() + ": "
						+ a.getScoreVisitant());
			}
		} else {
			System.out.println("No records");
		}
	}

}
