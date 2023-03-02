// This interface is implemented by all those
// classes that are to be updated whenever there
// is an update from CricketData
interface Observer {
	public void update(Team team1, Team team2, int quarter, boolean quarterIsFinished);
}
