
public class KeepTrackScore implements Observer {

	private int scoreLocal, scoreVisitant;

	@Override
	public void update(int scoreLocal, int scoreVisitant, boolean isQuarter) {
		this.scoreLocal = scoreLocal;
		this.scoreVisitant = scoreVisitant;
		display();
	}

	public void display() {
		System.out.println("Current score in the game: " + scoreLocal + " - " + scoreVisitant);
	}

}
