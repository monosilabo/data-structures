public class FixedCapacityStack<Item> {
	
	private int n;

	private int cap;

	public Item[] items;

	public FixedCapacityStack(int cap) {
		this.cap = cap;
		this.items = (Item[]) new Object[cap];
	}

	public void push(Item item) {
		this.items[this.n++] = item;
	}

	public Item pop() {
		return this.items[--this.n];
	}

	public boolean isEmpty() {
		return this.n == 0;
	}

	public int size() {
		return this.n;
	}
}