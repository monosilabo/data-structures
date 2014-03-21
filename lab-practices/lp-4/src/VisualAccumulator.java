public class VisualAccumulator {

	private double total;
	private int n;

	public VisualAccumulator(int trials, double max) {
		StdDraw.setXscale(0, trials);
		StdDraw.setYscale(0, max);
		StdDraw.setPenRadius(.005);
	}

	public void addValue(double val) {
		this.n++;
		this.total += val;

		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(this.n, val);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.point(this.n, this.mean());
	}

	public double mean() {
		return this.total / this.n;
	}

	public String toString() {
		return String.format("Mean of %d values: %10.2f", this.n, this.mean());
	}
}