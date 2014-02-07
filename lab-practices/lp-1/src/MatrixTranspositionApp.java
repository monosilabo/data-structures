// java MatrixTranspositionApp 1 2 \| 3 4
// java MatrixTranspositionApp 1 2
import java.util.Arrays;

public class MatrixTranspositionApp {
	public static void main(String[] args) {
		String[][] source = Parser.toStringMatrix(args);
		String[][] target;
		int m = source.length;
		int n;

		if (m > 0) {
			n = source[0].length;
			target = new String[n][m];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					target[j][i] = source[i][j];
				}
			}

			for (int i = 0; i < n; i++) {
				System.out.println(Arrays.toString(target[i]));
			}
		}
	}
}