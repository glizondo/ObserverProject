import java.util.ArrayList;
import java.util.Random;

public class Game {

	static ArrayList<Team> teams = new ArrayList<>();
	ArrayList<Team> teamsPlaying = new ArrayList<>();

	public Game() {
		this.teamsPlaying = generateRandomTeamsPlaying();
	}

	public ArrayList<Team> generateRandomTeamsPlaying() {

		Team team1 = new Team("LA Lakers");
		Team team2 = new Team("Golden State Warrios");
		Team team3 = new Team("Boston Celtics");
		Team team4 = new Team("Detroit Pistons");
		Team team5 = new Team("LA Lakers");

		teams.add(team1);
		teams.add(team2);
		teams.add(team3);
		teams.add(team4);
		teams.add(team5);

		Random random = new Random();
		int selection1 = random.nextInt(teams.size());
		int selection2 = random.nextInt(teams.size());
		while (selection1 == selection2) {
			selection1 = random.nextInt(teams.size());
			selection2 = random.nextInt(teams.size());
		}

		ArrayList<Team> teamsChosen = new ArrayList<>();
		teamsChosen.add(teams.get(selection1));
		teamsChosen.add(teams.get(selection2));

		return teamsChosen;

	}

	public ArrayList<Team> getTeamsPlaying() {
		return teamsPlaying;
	}

	public void setTeamsPlaying(ArrayList<Team> teamsPlaying) {
		this.teamsPlaying = teamsPlaying;
	}

}
