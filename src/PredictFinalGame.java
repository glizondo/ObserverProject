
public class PredictFinalGame implements Observer {
	static final double totalPercentagePrediction = 100;
	double percentageLocalPrediction;
	double percentageVisitantPrediction;

	@Override
	public void update(int scoreLocal, int scoreVisitant, boolean isQuarter) {
		double localPercentage = Math.floor(Math.random() * totalPercentagePrediction);
		this.percentageLocalPrediction = localPercentage;
		this.percentageVisitantPrediction = totalPercentagePrediction - localPercentage;
	}

	public void display() {
		System.out.println("Local team percentage: " + percentageLocalPrediction);
		System.out.println("Visitant team percentage: " + percentageVisitantPrediction);
	}

}
