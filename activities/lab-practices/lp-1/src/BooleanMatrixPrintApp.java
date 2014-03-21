import java.util.Arrays;

public class BooleanMatrixPrintApp {
	public static void main(String[] args) {
		boolean[][] matrix = Parser.toMatrix(args);
		int m = matrix.length;
		boolean[] row;

		if (m > 0) {
			row = matrix[0];

			for (int i = 0; i < m; i++) {
				row = matrix[i];
				System.out.println(Arrays.toString(row));
			}
		}
	}
}