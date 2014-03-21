public class Counter implements Comparable<Counter> {

	private int count;

	private final String name;

	public Counter(String name) {
		this.name = name;
	}

	public void increment() {
		this.count++;
	}

	public int getCount() {
		return this.count;
	}

	public int compareTo(Counter that) {
		if		(this.count < that.count)	return -1;
		else if	(this.count > that.count)	return 1;
		else								return 0;
	}

	public String toString() {
		return this.name;
	}
}