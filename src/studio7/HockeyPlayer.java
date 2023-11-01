package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private String shootingHand;
	private String handedness;
	private int goals;
	private int assists;
	private int games;
	private int points;
	
	

	
	public int getGoals() {
		return goals;
	}


	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public void addGoal(int goalsScored) {
		if (goalsScored>=0) {
			this.goals +=goalsScored;	
		}
	}


	public int getAssists() {
		return assists;
	}


	public void setAssists(int assists) {
		this.assists = assists;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public HockeyPlayer(String initName, int initjerseyNumber, String initshootingHand, String inithandedness) {
	 name=initName;
	 jerseyNumber=initjerseyNumber;
	 shootingHand=initshootingHand;
	 handedness=inithandedness;
	 goals=0;
	 assists=0;
	 games=0;
	 points=(goals+assists);
	}
	
	
	public static void main(String[] args) {
		HockeyPlayer p1=new HockeyPlayer("Teddy Gillanders", 7 , "Right", "Right");
		HockeyPlayer p2= new HockeyPlayer("Anish Jagannathan", 18, "Right","Right");
		HockeyPlayer p3= new HockeyPlayer("Ronak Agarwal", 1, "Either","Right");
		HockeyPlayer p4= new HockeyPlayer("Dov Schwartz", 22 , "Right", "Right");
		gamePlayed(p1, 3, 0);
		
	}

	public static void gamePlayed(HockeyPlayer playing, int goalsScored,int assistsRecorded) {
		playing.addGoal(goalsScored);
		System.out.print(playing.getGoals());
		System.out.print(playing.getName());
		playing.setGoals(0);
		System.out.print(playing.getGoals());
		
	}
}






