
public class RawStats {

	private String deaths = "0";//I want to be able to die trillions of times
	private String kills = "0";//I want to be able to kill trillions 
	private String assists = "0";// yeah
	private String kda = "0";
	
	
	
	public String getDeaths() {
		return deaths;
		
	}
	public String getKills() {
		return kills;
		
	}
	public String getAssists() {
		return assists;
		
	}
	public String getKDA() {
		return kda;
	}
	
	public String toString() {
		 return  " has a KDA of: " + kda+ "\n"+ "Kills: " + kills +  "\n"+ "Assists: " + assists+"\n"+"Deaths: " + deaths;
	}
public String additionWithStrings(String val1, String val2) {
		
		//MagicTODO: make it actually be able to add huge nums
		
		
		return  (Integer.parseInt(val1) + Integer.parseInt(val2))+"";
		
	}
	
	public String divisionOfKDA(String kills, String deaths, String assists) {
		
		String killAndAssi = additionWithStrings(kills,assists);
		
		//magic TODO: make it actually be able to divide huge nums
		
		if( Double.parseDouble(deaths) == 0.0) {
			return killAndAssi;
		}
		return String.format("%.2f",(Integer.parseInt(killAndAssi) / (Double.parseDouble(deaths)))) ;
		
	}
	
	
	public String incrKills(String kills) {//returns curr kills after adding kills
		
		this.kills = additionWithStrings(this.kills,kills);
		updateKDA();
		return this.kills;
		
	}
	public String incrDeaths(String deaths) {//returns curr deaths after adding kills
		
		this.deaths = additionWithStrings(this.deaths,deaths);
		updateKDA();
		return this.deaths;
		
	}
	public String incrAssists(String assists) {//returns curr assists after adding kills
		
		this.assists = additionWithStrings(this.assists,assists);
		updateKDA();
		return this.assists;
		
	}
	
	public String updateKDA() {
		
		this.kda = divisionOfKDA(this.kills,this.deaths,this.assists);
		
		
		return kda;
	}
}
