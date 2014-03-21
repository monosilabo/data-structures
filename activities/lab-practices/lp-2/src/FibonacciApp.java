public class FibonacciApp {
	public static long F(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	
	public static void main(String[] args) {
		Stopwatch sw;

		for (int N = 0; N < 100; N++) {
			sw = new Stopwatch();
			StdOut.print(N + " " + F(N) + " ");
			StdOut.println(sw.elapsedTime() + "s.");
		}
	}
}