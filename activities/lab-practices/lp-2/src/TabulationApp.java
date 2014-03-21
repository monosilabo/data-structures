import java.util.Arrays;

public class TabulationApp {
	public static void main(String[] args) {
		String name;
		double a, b, av;

		while (!StdIn.isEmpty()) {
			name = StdIn.readString();
			a = StdIn.readDouble();
			b = StdIn.readDouble();
			av = (a + b) / 2;
			StdOut.printf("%-12s%-12.0f%-12.0f%-9.3f\n", name, a, b, av);
		}
	}
}