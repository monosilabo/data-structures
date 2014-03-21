public class NumberEqualityForApp {
	public static void main(String[] args) {
		int[] nums = Parser.toInt(args);
		boolean equal = true;
		int index;
		
		if (nums.length > 1) {
			for (index = 0; index < nums.length - 1; index++) {
				equal = equal && (nums[index] == nums[index + 1]);

				if (!equal) {
					System.out.println("Numbers are not equal.");
					break;
				}
			}

			if (equal) {
				System.out.println("All numbers are equal.");
			}
			System.out.println("Iterations " + (index + 1));
		} else {
			System.out.println("Provide at least two numbers.");
		}
	}
}