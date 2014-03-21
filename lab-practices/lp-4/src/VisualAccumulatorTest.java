public class VisualAccumulatorTest {
	public static void main(String[] args) {
		int trials = Integer.parseInt(args[0]);
		VisualAccumulator va =  new VisualAccumulator(trials, 1.0);

		for (int i = 0; i < trials; i++) {
			va.addValue(StdRandom.uniform());
			StdOut.println(va);
		}
	}
}