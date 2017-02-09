
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ComedyCentral {
	public static void main(String[] args) {
		ArrayList<String> jokes = new ArrayList<String>();
		ArrayList<String> punchLine = new ArrayList<String>();
		jokes.add("Why did the chicken cross the road?");
		punchLine.add("To get to the other side!");
		jokes.add("What is 1 + 1?");
		punchLine.add("Fifty-two!");
		jokes.add("Why is the Bohr theory for electrons incorrect?");
		punchLine.add("Because electrons do not move in circles, and their position is unpredictable.");
		jokes.add("How do you eat a banana?");
		punchLine.add("You put it in your mouth!");
		jokes.add("What does a mitocondria release?");
		punchLine.add("Adenosine Triphosphate");
		jokes.add("What is the the cosine of an opposite angle on a right triangle?");
		punchLine.add("The tangent of the other angle.");
		
		int random = new Random().nextInt(jokes.size());
		JOptionPane.showMessageDialog(null, jokes.get(random));
		JOptionPane.showMessageDialog(null, punchLine.get(random));
	}
}
