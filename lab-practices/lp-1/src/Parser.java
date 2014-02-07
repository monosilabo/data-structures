public class Parser {
	public static int[] toInt(String[] args) {
		int[] nums = new int[args.length];
		int index;

		if (args.length > 0) {
			for (index = 0; index < args.length; index++) {
				try {
					nums[index] = Integer.parseInt(args[index]);
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException("Argument " + args[index] + " is not an integer.");
				}
			}
		}

		return nums;
	}

	public static int[] parseDimensions(String[] args) {
		// In mathematics, a matrix (plural matrices) is a rectangular array[1] of numbers, 
		// symbols, or expressions, arranged in rows and columns.
		int l = args.length;
		int m = 0;
		int n = 0;
		int nc = 0;
		int[] dim = new int[2];
		String s = "";
		
		if (l > 0 && (args[0].equals("|") || args[l - 1].equals("|"))) {
			throw new IllegalArgumentException("Rows separators misplaced.");
		}

		// Parse input
		for (int i = 0; i < l; i++) {
			s = args[i];

			if (!s.equals("|")) {
				nc++;
			}
			if (s.equals("|") && (i + 1 < l) && args[i + 1].equals("|")) {
				throw new IllegalArgumentException("Contiguous row separators.");
			}
			if (s.equals("|") || i == l - 1) {
				if (++m > 1 && n != nc) {
					throw new IllegalArgumentException("Rows must have the same number of columns.");
				}
				n = nc;
				nc = 0;
			}
		}

		dim[0] = m;
		dim[1] = n;

		return dim;
	}

	public static boolean[][] toMatrix(String[] args) {
		int m = 0;
		int n = 0;
		int[] dim = parseDimensions(args);
		boolean[][] matrix =  new boolean[dim[0]][dim[1]];
		String s;
		boolean b;

		for (int i = 0; i < args.length; i++) {
			s = args[i];

			if (s.equals("|")) {
				m++;
				n = 0;
			} else {
				if (s.equals("1")) { // Refactor into a method 
					b  = true;
				} else if (s.equals("0")) {
					b  = false;
				} else {
					// What about true/false? Should they be valid?
					throw new IllegalArgumentException(s + " is not a bool. Only 1 and 0 are.");
				}
				matrix[m][n++] = b;
			}
		}

		return matrix;
	}

	public static String[][] toStringMatrix(String[] args) {
		int m = 0;
		int n = 0;
		int[] dim = parseDimensions(args);
		String[][] matrix = new String[dim[0]][dim[1]];
		String s;

		for (int i = 0; i < args.length; i++) {
			s = args[i];

			if (s.equals("|")) {
				m++;
				n = 0;
			} else {
				matrix[m][n++] = s;
			}
		}

		return matrix;
	}
}