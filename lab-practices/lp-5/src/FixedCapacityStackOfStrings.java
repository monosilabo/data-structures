public class FixedCapacityStackOfStrings {
	
	private int n;

	private int cap;

	public String[] items;

	public FixedCapacityStackOfStrings(int cap) {
		this.cap = cap;
		this.items = new String[cap];
	}

	public void push(String item) {
		this.items[this.n++] = item;
	}

	public String pop() {
		return this.items[--this.n];
	}

	public boolean isEmpty() {
		return this.n == 0;
	}

	public int size() {
		return this.n;
	}
}