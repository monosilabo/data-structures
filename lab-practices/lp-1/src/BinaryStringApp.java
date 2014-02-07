public class BinaryStringApp {
	public static void main(String[] args) {
		int[] nums = Parser.toInt(args);
		int num;

		if (nums.length > 0) {
			num = nums[0];

			System.out.println(Integer.toBinaryString(num) + " using Integer.toBinaryString");
			System.out.println(toBinaryString(num) + " using BinaryStringApp.toBinaryString");
		} else {
			System.out.println("Type a number");
		}
	}

	public static String toBinaryString(int num) {
		String s = "";

		for (int n = num; n > 0; n /= 2) {
			s = (n % 2) + s;
		}

		return s;
	}
}