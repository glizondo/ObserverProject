// This interface is implemented by all those
// classes that are to be updated whenever there
// is an update from CricketData
interface Observer {
	public void update(int scoreLocal, int scoreVisitant, boolean isQuarter);
}
