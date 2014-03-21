import java.util.Arrays;

public class ParserApp {
	public static void main(String[] args) {
		String[][] matrix;
		String[] row;
		int m;
		
		try {
			matrix = Parser.toStringMatrix(args);
			m = matrix.length;
			
			if (m > 0) {
				row = matrix[0];

				for (int i = 0; i < m; i++) {
					row = matrix[i];
					System.out.println(Arrays.toString(row));
				}
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
}