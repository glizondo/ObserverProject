
public class KeepTrackScore implements Observer {

	private int scoreLocal, scoreVisitant, quarter;


	@Override
	public void update(int scoreLocal, int scoreVisitant, int quarter) {
		this.scoreLocal = scoreLocal;
		this.scoreVisitant = scoreVisitant;
		this.quarter = quarter;
//		display();
	}

	public void display() {
		System.out.println("Current score in the game: " + scoreLocal + " - " + scoreVisitant + " Quarter: "+ quarter);
	}

}
