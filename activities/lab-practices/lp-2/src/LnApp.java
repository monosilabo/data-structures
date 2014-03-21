public class LnApp {
	// Naive and poor algorithm to compute the factorial n!
	// Fast factorial functions: http://www.luschny.de/math/factorial/FastFactorialFunctions.htm
	public static long factorial(long n) {
		if (n < 0) throw new IllegalArgumentException("The factorial n! is defined only for positive integers.");
		if (n == 0) return 1;

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		long n;

		if (args.length > 0) {
			 n = Long.parseLong(args[0]);
			 System.out.println(Math.log(factorial(20)));
		}
	}
}