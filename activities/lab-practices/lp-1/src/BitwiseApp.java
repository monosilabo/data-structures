public class BitwiseApp {
	public static void main(String[] args) {
		boolean fallacy = true && false;
		// 1000
		// 1010
		// ----
		// 1000
		int num =  8 & 10;

		System.out.println("fallacy equals to " + fallacy);
		System.out.println("num equals to " + num);
	}
}