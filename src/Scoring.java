import java.util.ArrayList;
import java.util.Iterator;

public class Scoring implements Subject {
	int scoreLocal;
	int scoreVisitant;
	int quarter;
	final int maxQuarter = 4;
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
			o.update(scoreLocal, scoreVisitant, quarter);
		}
	}

	private int getLocalScore() {
		if (quarter == maxQuarter) {
			return 0;
		}
		return (int) Math.floor(Math.random() * 33);
	}

	private int getVisitantScore() {
		if (quarter == maxQuarter) {
			return 0;
		}
		return (int) Math.floor(Math.random() * 33);
	}

	private int getQuarter() {
		if (quarter == maxQuarter) {
			return 0;
		}
		return quarter = 1;
	}

	public void dataChanged() {
		if (quarter != maxQuarter) {
		scoreLocal += getLocalScore();
		scoreVisitant += getVisitantScore();
		quarter += getQuarter();
		notifyObservers();
		}
		else {
			System.out.println("End of game");
		}
	}

}
