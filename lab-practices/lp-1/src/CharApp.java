public class CharApp {
	public static void main(String[] args) {
		System.out.println('b');
		System.out.println('b' + 'c'); // (0x0062 + 0x0063 = 0xC5) = 197
		System.out.println((char) ('a' + 4)); // (char) (0x0061 + 0x0004 = 0x0065) = e

		// http://jrgraphix.net/r/Unicode/0020-007F
		// Unicode escape representation
		System.out.println('\u004D'); // M
	}
}