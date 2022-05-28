
public class Main {
	
	
	static RawStats r = new RawStats();
	static String rando;
	static RawStats h = new RawStats();
	public static void randomRawStats(RawStats m) {
		rando =  (int)(Math.random()*100)+"";
		m.incrKills(rando);
		
		 rando =  (int)(Math.random()*100)+"";
		 m.incrDeaths(rando);
		 
		 rando =  (int)(Math.random()*100)+"";
		 m.incrAssists(rando);
		
	}
	
	
	
	public static void main(String[] args) {
		randomRawStats(r);
		 GameStats g = new GameStats("1", r);
		 randomRawStats(h);
		 g.addGame("2", h);
		
		 
		PlayerStats rezonator = new PlayerStats("Rezonator",g);
		System.out.println(rezonator);
		System.out.println(rezonator.gameHistory());
		
	}
}


