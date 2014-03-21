public class StringComparableApp {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";

		// http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
		if (a.compareTo(b) < 0) {
			System.out.println("'a' string is lexicographically less than the string 'b'");
		}
	}
}