// http://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
// http://docs.oracle.com/javase/7/docs/api/java/lang/System.html
// http://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html
public class Sum {
	public static void main(String[] args) {
		int num;
		int sum = 0;

		if (args.length > 0) {
			for (String s: args) {
				try {
					num = Integer.parseInt(s);
					sum += num;
				} catch (NumberFormatException e) {
					System.err.println("Argument " + s + " is not an integer");
					System.exit(1);
				}
			}

			System.out.println("The sum equals to " + sum);
		}
	}
}