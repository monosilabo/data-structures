// java HistogramApp 2 3 3 1 \| 4
import java.util.Arrays;

public class HistogramApp {
	public static void main(String[] args) {
		int[][] params = parse(args);
		int[] hist = histogram(params[0], params[1][0]);


		if (params[0][1] > 0) {
			System.out.println(Arrays.toString(hist));
		}
	}

	public static int[] histogram(int[] data, int m) {
		int[] hist = new int[m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[j] == i) {
					hist[i]++;
				}
			}
		}

		return hist;
	}

	public static int[][] parse(String[] args) {
		int[][] params = new int[2][];
		params[1] = new int[1];
		int c = 0;
		String s;

		for (; c++ < args.length && !args[c].equals("|"); );

		params[0] = new int[c];
		for (int i = 0; i < args.length; i++) {
			s = args[i];
			if (s.equals("|")) {
				if (i + 1 < args.length) {
					params[1][0] = Integer.parseInt(args[i + 1]);
				}

				break;
			} else {
				params[0][i] = Integer.parseInt(s);
			}
		}
		System.out.println(params[1][0]);
		return params;
	}
}