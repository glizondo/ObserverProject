import java.util.ArrayList;

public class Scoring implements Subject {
	int scoreLocal;
	int scoreVisitant;
	boolean isQuarter;
	ArrayList<Observer> observerList;

	public Scoring() {
		super();
		observerList = new ArrayList<Observer>();

	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterObserver(Observer o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObservers() {
		if (isQuarter) {

		}

	}

}
