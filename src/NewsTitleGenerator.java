
public class NewsTitleGenerator implements Observer {

	private Team team1, team2;
	private int quarter;

	@Override
	public void update(Team team1, Team team2, int quarter, boolean quarterIsFinished) {
		this.team1 = team1;
		this.team2 = team2;
		this.quarter = quarter;
	}

	public void displayNewsTitleBasedOnScore() {
		if (quarter == 4) {
			if (team1.score > 80) {
				System.out.println("The great " + team1.name + " wiped the " + team2.name
						+ " leaving them no choice with a result of " + team1.score + " - " + team2.score
						+ ", OUTSTANDING!");
			} else if (team1.score < team2.score) {
				System.out.println("It did not matter that they were playing out of their hometown! " + team2.name
						+ " crashed " + team1.name + " with a final result of " + team1.score + " - " + team2.score);
			} else if (team1.score + team2.score < 100) {
				System.out.println(
						"Not a lot of points scored in this game. After some back and forth, " + team1.name + " and "
								+ team2.name + " ended up with a final result of " + team1.score + " - " + team2.score);
			} else if (team1.score == team2.score) {
				System.out.println("Incredible! " + team1.name + " and " + team2.name
						+ " tied last night with a result of " + team1.score + " - " + team2.score);
			} else {
				System.out.println("The result of the game between " + team1.name + " and " + team2.name + " was "
						+ team1.score + " - " + team2.score);
			}

		} else {
			System.out.println("The game has to finish to generate news!");
		}
	}

}
