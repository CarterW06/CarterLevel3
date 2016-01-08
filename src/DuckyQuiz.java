import java.util.*;

public class DuckyQuiz {

	public static void main(String[] args) {
		ArrayList<Duck> alDuck = new ArrayList<Duck>();
		alDuck.add(new Duck("Daffy"));
		alDuck.get(0).feed();
		for(Duck d : alDuck) {
			d.feed();
		}
	}

}
