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
		observerList.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		if (isQuarter) {

		}

	}

}
