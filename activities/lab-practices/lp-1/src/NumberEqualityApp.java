public class NumberEqualityApp {
	public static void main(String[] args) {
		int[] nums = Parser.toInt(args);
		boolean equal = true;
		int index = 0;
		
		if (nums.length > 1) {
			do {
				equal = equal && (nums[index] == nums[++index]);
			} while (equal && index < nums.length - 1);

			if (equal) {
				System.out.println("All numbers are equal.");
			} else {
				System.out.println("Numbers are not equal.");
			}

			System.out.println("Iterations " + index);
		} else {
			System.out.println("Provide at least two numbers.");
		}
	}
}