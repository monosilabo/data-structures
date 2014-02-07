import java.util.Arrays;

public class ArrayPrintApp {
	public static void main(String[] args) {
		int[] primes = {1, 2, 3, 5, 7};

		System.out.println(primes);
		// http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#toString(int[])
		System.out.println(Arrays.toString(primes));
	}
}