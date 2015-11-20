import java.util.*;
import javax.swing.*;

public class DinnerDecider {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Mashed Potatoes");
		arraylist.add("Tofu");
		arraylist.add("Pizza");
		
		JOptionPane.showMessageDialog(null, "What will i have for dinner?");
		JOptionPane.showMessageDialog(null, "You should eat this:\n" + arraylist.get(new Random().nextInt(arraylist.size())));
	}
}
