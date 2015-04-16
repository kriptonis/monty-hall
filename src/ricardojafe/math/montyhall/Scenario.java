package ricardojafe.math.montyhall;

import java.util.Random;

public class Scenario {
	
	boolean doorA;
	boolean doorB;
	boolean doorC;
	
	public void assignPrize(){
		Random rand = new Random();

		int max = 3;
		int min = 1;
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    
	    switch (randomNum) {
			case 1: doorA = true; doorB = doorC = false; break;
			case 2: doorB = true; doorA = doorC = false; break;
			case 3: doorC = true; doorB = doorA = false; break;
		}
	}
	
	public int getPrizedDoor(){
		if(doorA)return 1;
		if(doorB)return 2;
		return 3;//it must be door c, no check needed.
	}

}
