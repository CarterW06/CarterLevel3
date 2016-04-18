import java.util.*;

public class Snake {
	private int viciousness;
	private boolean venomous;

	protected Snake(int viciousness, boolean venomous) {
		this.viciousness = viciousness;
		this.venomous = venomous;
	}

	protected int getViciousness() {
		return viciousness;
	}

	protected boolean isVenomous() {
		return venomous;
	}
}

class Randomness {
	protected static boolean randomBool() {
		int random = new Random().nextInt(2);
		if (random == 0) {
			return true;
		} else {
			return false;
		}
	}

	protected static int randomInt() {
		return new Random().nextInt(10) + 1;
	}
}

class Plane {
	private static int numberOfPassengers = Randomness.randomInt();
	static ArrayList<Snake> alSnake = new ArrayList<Snake>();

	public static void main(String[] args) {
		int venomousSnakes = 0;
		int viscousness = 0;
		for (int i = 0; i < 100; i++) {
			alSnake.add(new Snake(Randomness.randomInt(), Randomness.randomBool()));
			for(Snake s : alSnake) {
				if(s.isVenomous()) {
					venomousSnakes++;
				}
				viscousness += s.getViciousness();
			}
		}
		int probOfDeath = (venomousSnakes * viscousness) / numberOfPassengers;
		System.out.println("The probability of death is:\n" + probOfDeath / 1000000 + "%");
	}
}