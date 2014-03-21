public class FibonacciCachedApp {
	public static long[] fs;

	public static long F(int N) {
		fs = new long[N];
		return FC(N);
	}

	public static long FC(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;

		fs[N - 1] = fs[N - 1] == 0 ? FC(N - 1) : fs[N - 1];
		fs[N - 2] = fs[N - 2] == 0 ? FC(N - 2) : fs[N - 2];

		return fs[N - 1] + fs[N - 2];
	}
	
	public static void main(String[] args) {
		long startTime;
		long estimatedTime;

		for (int N = 0; N < 100; N++) {
			startTime = System.nanoTime();
			StdOut.print(N + " " + F(N) + " ");
			estimatedTime = System.nanoTime() - startTime;
			StdOut.println(estimatedTime + "ns.");
		}
	}
}