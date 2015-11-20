import java.util.ArrayList;

public class ArrayOverload {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		ArrayList<String> als = new ArrayList<String>();
		try {
			for (;;) {
				als.add(new String("kdjfkdjfkdjfkjdkfjdkfjdkfjdkjfdkjfdkjfdkjfkdjkjfkdjfkdjf"));
				System.out.println("test");
			}
		} catch (Exception e) {
			System.out.println((time - System.currentTimeMillis()) * 1000);
		}
	}
}
