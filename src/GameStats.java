import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GameStats {//stats of a particular game
	
	private Set<String> gamesPlayed = new HashSet<String>();
	Map<String, RawStats> games = new HashMap<String, RawStats>();//game id to stats of a game
	
	
	
	public GameStats(String gameID, RawStats stats) {
		gamesPlayed.add(gameID);
		games.put(gameID, stats);
		
	}
	
	public Set<String> getGamesPlayed(){
		return gamesPlayed;
	}
	public void addGame(String gameID,RawStats stats) {
		gamesPlayed.add(gameID);
		games.put(gameID, stats);
	}
	public RawStats getStatsOfGame(String gameID)  {
		
		if(games.containsKey(gameID)) {
			return games.get(gameID);
		}
		
		return null;
		
	}
	public String showAllPlayedGames() {
		String j = "";
		 for(String g: gamesPlayed) {
			j+=searchStatsForGame(g);
			//tried to do the cool join thing suggested but for some reason will not work 
			
		 }
		return j;
		
	}
	public String searchStatsForGame(String gameID) {
		return  "\n"+ "Stats for "+ gameID + getStatsOfGame(gameID).toString() +"\n" ;
	}

	
	

}
