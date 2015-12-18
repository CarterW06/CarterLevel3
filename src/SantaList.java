import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.*;

public class SantaList implements ActionListener {
	public static void main(String args[]) {
		new SantaList().generateGUI();
	}

	JFrame jf = new JFrame();
	JLabel jl = new JLabel();
	ArrayList<JLabel> aljl = new ArrayList<JLabel>();
	JPanel panel = new JPanel();

	private void generateGUI() {
		aljl.add(loadImageFromTheInternet("http://www.selangortimes.com/images/user//img_1308.png"));
		aljl.add(loadImageFromTheInternet("https://isocpp.org/files/img/tour.PNG"));
		aljl.add(loadImageFromTheInternet(
				"http://d3by36x8sj6cra.cloudfront.net/assets/images/book/large/9780/8153/9780815341307.jpg"));
		JButton jb = new JButton();
		panel.add(jb);
		panel.add(jl);
		jf.add(panel);
		jf.pack();
		jb.addActionListener(this);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panel.remove(jl);
		jl = aljl.get(new Random().nextInt(3));
		panel.add(jl);
		jf.pack();
	}
}