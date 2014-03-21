public class Flips {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		String format = "%s: %d (%2.2f%%)\n";
		String win = "%s win\n";

		for (int i = 0; i < n; i++) {
			if (StdRandom.bernoulli(.5)) {
				heads.increment();
			} else {
				tails.increment();
			}
		}
				
		StdOut.printf(format, heads.toString(), heads.getCount(), (heads.getCount() *  100.0)/ n);
		StdOut.printf(format, tails.toString(), tails.getCount(), (tails.getCount() *  100.0)/ n);
		
		if (heads.compareTo(tails) == 1) {
			
		}
		
		int comparison = heads.compareTo(tails);
		if		(comparison == -1)	StdOut.printf(win, tails);
		else if	(comparison == 1)	StdOut.printf(win, heads);
		else StdOut.println("Equal probabilities");
	}
}