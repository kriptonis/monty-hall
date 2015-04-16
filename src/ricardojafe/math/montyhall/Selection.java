package ricardojafe.math.montyhall;

import java.util.Random;

public class Selection {
	Scenario scenario;
	int selection;
	
	public void makeSelection(){
		Random rand = new Random();

		int max = 3;
		int min = 1;
	    selection = rand.nextInt((max - min) + 1) + min;
	}
	
	public boolean checkWin(){
		switch (selection) {
			case 1: return scenario.doorA;
			case 2: return scenario.doorB;
			case 3: return scenario.doorC;
			default: throw new NoSuchFieldError("There is no door number for the selection. ERROR!");
		}
	}
	
	public void setScenario(Scenario scn){
		scenario = scn;
	}

	public int getSelection(){
		return selection;
	}
	
	public void switchSelection(){
		switch(selection){
			case 1:	
				if(scenario.getPrizedDoor() == 1)selection = 2;
				if(scenario.getPrizedDoor() == 2)selection = 2;
				if(scenario.getPrizedDoor() == 3)selection = 3;
				break;
			case 2:
				if(scenario.getPrizedDoor() == 1)selection = 1;
				if(scenario.getPrizedDoor() == 2)selection = 1;
				if(scenario.getPrizedDoor() == 3)selection = 3;
				break;
			case 3:
				if(scenario.getPrizedDoor() == 1)selection = 1;
				if(scenario.getPrizedDoor() == 2)selection = 2;
				if(scenario.getPrizedDoor() == 3)selection = 2;
				break;
		}
	}
}
