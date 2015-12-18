
public class Ornament {
	private int num;
	
	Ornament(int num) {
		this.num = num;
	}
	
	public void hang() {
		System.out.println("Ornament #" + num + " has been hung.");
	}
}
