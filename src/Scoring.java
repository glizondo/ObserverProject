import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Scoring implements Subject {
	private Team team1;
	private Team team2;
	private TeamsGenerator teamsGen = new TeamsGenerator();
	private ArrayList<Team> teamsPlaying;
	private int quarter;
	private boolean quarterIsFinished = true;
	private final int maxQuarter = 4;
	public ArrayList<Observer> observerList;

	public Scoring() {
		observerList = new ArrayList<Observer>();
		teamsPlaying = teamsGen.generateRandomTeamsPlaying();
		this.team1 = teamsPlaying.get(0);
		this.team2 = teamsPlaying.get(1);
	}

	public Scoring(Team team1, Team team2, int quarter, boolean quarterIsFinished) {
		observerList = new ArrayList<Observer>();
		this.team1 = team1;
		this.team2 = team2;
		this.quarter = quarter;
		this.quarterIsFinished = quarterIsFinished;
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
			o.update(team1, team2, quarter, quarterIsFinished);
		}
	}

	private int increaseScore() {

		return (int) Math.floor(Math.random() * 35);
	}

	private int increaseQuarter() {
		if (quarter == maxQuarter) {
			return 0;
		}
		return quarter = 1;
	}

	public void startQuarter() {
		if (quarterIsFinished && quarter != 4) {
			quarterIsFinished = false;
			quarter += increaseQuarter();
			notifyObservers();
			System.out.println("Quarter " + quarter + " started");
		} else {
			System.out.println("First you must finish the quarter/Start new game");
		}
	}

	public void simulateQuarter() {
		if (!quarterIsFinished) {
			if (quarter != maxQuarter) {
				quarterIsFinished = true;
				team1.score += increaseScore();
				team2.score += increaseScore();
				notifyObservers();
				System.out.println("Quarter " + quarter + " simulated and finished");
			} else {
				quarterIsFinished = true;
				team1.score += increaseScore();
				team2.score += increaseScore();
				notifyObservers();
				System.out.println("End of game");
			}
		} else {
			System.out.println("You have to start the quarter first/Start new game");
		}
	}

	public String getNameLocal() {
		return team1.name;
	}

	public String getNameVisitant() {
		return team2.name;
	}

	public int getScoreLocal() {
		return team1.score;
	}

	public int getScoreVisitant() {
		return team2.score;
	}

}
