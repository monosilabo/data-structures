public class BinarySearchApp {

	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int N = 1000000;
		int[] set = new int[N];
		int val, index;
		long startTime;
		long estimatedTime;

		for (int i = 0; i < N; i++) {
			set[i] = StdRandom.uniform(N);
		}
		val = StdRandom.uniform(N);
		startTime = System.nanoTime();
		index = rank(val, set);
		estimatedTime = System.nanoTime() - startTime;
		StdOut.printf("%12d - %12d - %dns", val, index, estimatedTime);
	}
}