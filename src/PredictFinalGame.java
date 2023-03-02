
public class PredictFinalGame implements Observer {
	private Team team1;
	private Team team2;
	private int simulatedLocalScore;
	private int simulatedVisitantScore;
	private int quarter;
	static final double totalPercentagePrediction = 100;
	private double percentageLocalPrediction;
	private double percentageVisitantPrediction;

	@Override
	public void update(Team team1, Team team2, int quarter, boolean quarterIsFinished) {
		this.team1 = team1;
		this.team2 = team2;
		this.quarter = quarter;
	}

	public void displaySimulationPredictionGame() {
		if (quarter <= 1) {
			predictFinalResultGame();
			System.out.println("Result simulation: " + team1.name + ": " + simulatedLocalScore + " - " + team2.name
					+ ": " + simulatedVisitantScore);
		} else {
			System.out.println("Simulation prediction of result only available at the beginning of the game");
		}

	}

	public void predictFinalResultGame() {
		increaseScoreSimulator();
	}

	private void increaseScoreSimulator() {
		simulatedLocalScore = team1.score;
		simulatedVisitantScore = team2.score;
		simulatedLocalScore += (int) Math.floor(Math.random() * incrementMultiplier(quarter));
		simulatedVisitantScore += (int) Math.floor(Math.random() * incrementMultiplier(quarter));
	}

	private int incrementMultiplier(int quarter) {
		int increment = 0;
		if (quarter == 0) {
			increment = 140;
		}
		if (quarter == 1) {
			increment = 105;
		}
		return increment;
	}

	public void displayPercentageResultBasedOnRealResult() {
		setPercentagePredictionConsideringQuarter();
		System.out.println(team1.name + " percentage: " + percentageLocalPrediction);
		System.out.println(team2.name + " Visitant team percentage: " + percentageVisitantPrediction);
	}

	public void setPercentagePredictionConsideringQuarter() {
		calculatePercentagePerQuarter(quarter);
	}

	private void calculatePercentagePerQuarter(int quarter) {

		if (team1.score == team2.score) {
			percentageLocalPrediction = (totalPercentagePrediction / 2);
			percentageVisitantPrediction = (totalPercentagePrediction / 2);
		}
		if (team1.score > team2.score) {
			percentageLocalPrediction = Math
					.floor((totalPercentagePrediction / 2) * (1 + incrementOrDecrementPerQuarter(quarter)));
			percentageVisitantPrediction = Math
					.floor((totalPercentagePrediction / 2) * (1 - incrementOrDecrementPerQuarter(quarter)));
		}
		if (team1.score < team2.score) {
			percentageLocalPrediction = Math
					.floor((totalPercentagePrediction / 2) * (1 - incrementOrDecrementPerQuarter(quarter)));
			percentageVisitantPrediction = Math
					.floor((totalPercentagePrediction / 2) * (1 + incrementOrDecrementPerQuarter(quarter)));
		}

	}

	private double incrementOrDecrementPerQuarter(int quarter) {
		double difference = 0.0;
		if (quarter == 0) {
			difference = 0.0;
		}
		if (quarter == 1) {
			difference = 0.1;
		}
		if (quarter == 2) {
			difference = 0.2;
		}
		if (quarter == 3) {
			difference = 0.46;
		}
		if (quarter == 4) {
			difference = 1;
		}
		return difference;

	}

}
