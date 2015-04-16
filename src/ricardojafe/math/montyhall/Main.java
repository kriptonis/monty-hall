package ricardojafe.math.montyhall;

/**
 * This simple program helps demonstrate the known Monty Hall math puzzle
 * In the Monty Hall puzzle a contestant is given 3 doors to chose. On one
 * of the doors there is a prize and on the other two there is nothing.
 * When the contestant picks a door, the host reveals one of the other doors
 * and asks the contestant if he wants to switch to the remaining door.
 * The dilema is, should you stick with your first choice, should you change or
 * does it even matter? This program shows the answer clearly is to always switch.
 * @author ricardo.jafe
 *
 */
public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		
		game.startGameSeries(100);
		System.out.println(game.checkWinsIfNeverSwitch());
		System.out.println(game.checkWinsIfAlwaysSwitch());

	}

}
