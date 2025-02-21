
public class main {

	public static void main(String[] args) {
		int[] vect = new int[5];
		for (int i : vect) {
			vect[i + 1] = vect[i - 1];
			System.out.println(vect[i]);
		}

	}
}
