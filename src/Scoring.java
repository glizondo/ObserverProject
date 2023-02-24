import java.util.ArrayList;
import java.util.Iterator;

public class Scoring implements Subject {
	int scoreLocal;
	int scoreVisitant;
	boolean isQuarter;
	ArrayList<Observer> observerList;

	public Scoring() {
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
		for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) {
			Observer o = it.next();
			o.update(scoreLocal, scoreVisitant, isQuarter);
		}
	}

	private int getLocalScore() {
		return (int) Math.floor(Math.random() * 33);
	}

	private int getVisitantScore() {
		return (int) Math.floor(Math.random() * 33);
	}

	public void dataChanged() {
		scoreLocal += getLocalScore();
		scoreVisitant += getVisitantScore();
		notifyObservers();
	}

}
