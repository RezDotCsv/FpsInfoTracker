import java.util.Set;

public class PlayerStats {//stats of the character over all
	private String name ;
	private String deaths = "0";//I want to be able to die trillions of times
	private String kills = "0";//I want to be able to kill trillions 
	private String assists = "0";// yeah
	private String kda = "0";
	private GameStats gStats;
	public PlayerStats(String name,GameStats gStats) {
		this.name = name;
		this.gStats=gStats;
		try {
			addGameStatsToPlayerStats(this.gStats.getGamesPlayed());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addGameStatsToPlayerStats(Set<String> set) throws Exception {
		for(String s: set) {
			
			this.kills = gStats.getStatsOfGame(s).additionWithStrings(gStats.getStatsOfGame(s).getKills(),this.kills);
			this.deaths = gStats.getStatsOfGame(s).additionWithStrings(gStats.getStatsOfGame(s).getDeaths(),this.deaths);
			this.assists = gStats.getStatsOfGame(s).additionWithStrings(gStats.getStatsOfGame(s).getAssists(),this.assists);
			this.kda = gStats.getStatsOfGame(s).divisionOfKDA(this.kills,this.deaths, this.assists);
		}
	}
	
	public String gameHistory() {
		return gStats.showAllPlayedGames();
	}
	public String toString() {
		
		return name + " has a KDA of: " + kda+ "\n"+ "Kills: " + kills +  "\n"+ "Assists: " + assists+"\n"+"Deaths: " + deaths;
	}
	
	

	
}
