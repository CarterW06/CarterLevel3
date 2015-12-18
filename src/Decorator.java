import java.util.ArrayList;
import java.util.Random;

public class Decorator {

	public static void main(String[] args) {
		ArrayList<Integer> ali = new ArrayList<Integer>();
		ArrayList<Ornament> alo = new ArrayList<Ornament>();
		
		for(int i = 0; i < 5; i++) {
			int num = new Random().nextInt();
			ali.add(num);
			alo.add(new Ornament(num));
		}
		
		for(Ornament o : alo) {
			HangThread ht = new HangThread(o);
			Thread t = new Thread(ht);
			t.start();
		}
		
		for(int i : ali) {
			System.out.println(i);
		}
	}

}

class HangThread implements Runnable {
	private Ornament o;
	
	HangThread(Ornament o) {
		this.o = o;
	}
	
	public synchronized void run() {
		o.hang();
	}
}