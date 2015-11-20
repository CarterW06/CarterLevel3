import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class BandNamesGenerator {

	public static void main(String[] args) {
		ArrayList<String> adjective = new ArrayList<String>();
		ArrayList<String> noun = new ArrayList<String>();
		adjective.add("blue");
		adjective.add("smelly");
		adjective.add("crazy");
		adjective.add("slimy");
		adjective.add("grumpy");
		noun.add(" mitocondria");
		noun.add(" 30 60 90 triangle");
		noun.add(" ribisome");
		noun.add(" Hiensberg uncertinty principle");
		noun.add(" book");
		
		int randomAdjective = new Random().nextInt(adjective.size());
		int randomNoun = new Random().nextInt(adjective.size());
		JOptionPane.showMessageDialog(null, "The " + adjective.get(randomAdjective) + noun.get(randomNoun) + "s!");
	}

}
