package ricardojafe.math.montyhall;

import java.util.ArrayList;

public class Game {
	
	
	ArrayList<Selection> allPlays = new ArrayList<Selection>();
	
	void startGameSeries(int numberOfScenarios){
		for(int i = 0; i<numberOfScenarios;i++){
			Scenario scn = new Scenario();
			scn.assignPrize();
			Selection selection = new Selection();
			selection.setScenario(scn);
			selection.makeSelection();
			allPlays.add(selection);
		}
	}
	
	public String checkWinsIfAlwaysSwitch(){
		int wins = 0, loses = 0;
		for(Selection s : allPlays){
			s.switchSelection();
			if(s.checkWin()){
				wins++;
			}else{
				loses++;
			}
		}
		return "If you always switch you would have won: "+wins+" times out of "+(wins+loses);
	}
	
	public String checkWinsIfNeverSwitch(){
		int wins = 0, loses = 0;
		for(Selection s : allPlays){
			if(s.checkWin()){
				wins++;
			}else{
				loses++;
			}
		}
		return "If you never switch you would have won: "+wins+" times out of "+(wins+loses);
	}

}
