# Laboratory practice

## Exercises

1. Give the value of `exR1(6)`:

	```
	public static String exR1( int n) {
		if (n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
	```

2. Run the following program on your computer:

	```
	public class Fibonacci {
		public static long F(int N) {
			if (N == 0) return 0;
			if (N == 1) return 1;
			return F(N-1) + F(N-2);
		}
		
		public static void main(String[] args) {
			for (int N = 0; N < 100; N++) {
				StdOut.println(N + " " + F(N));
			}
		}
	}
	```
	
	What is the largest value of N for which this program takes less 1 hour to compute the value of `F(N)`? Develop a better implementation of `F(N)` that saves computed values in an array.
	
3. Write a recursive static method that computes the value of `ln(N!)`. Make it fast!
4. Write a program that reads in lines from standard input with each line containing a name and two integers and then uses `printf()` to print a table with a column of the names, the integers, and the result of dividing the first by the second, accurate to three decimal places. You could use a program like this to tabulate batting averages for baseball players or grades for students.
5. Random connections. Write a program that takes as command-line arguments an integer N, plots N equally spaced dots of size .05 on the circumference of a circle, and then, with an uniform probability p for each pair of points, draws a gray line connecting them. Use `StdDraw` class from `stdlib.jar`.
	

