// java BooleanMatrixApp 1 0 1 \| 0 0 0
public class BooleanMatrixApp {
	public static void main(String[] args) {
		boolean[][] matrix = Parser.toMatrix(args);
		int m = matrix.length;
		int n;
		char ch;

		if (m > 0) {
			n = matrix[0].length;

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					ch = matrix[i][j] ? '*' : '-';
					// http://www.cs.gsu.edu/csc2010/f13/assignments/h4/printf.pdf
					System.out.printf("%d,%d %s%n", i, j, ch);
				}
			}
		}
	}
}