import java.util.Iterator;

// http://docs.oracle.com/javase/7/docs/api/java/lang/Iterable.html
public class DynamicCapacityStack<Item> implements Iterable<Item> {
	
	private int n = 0;

	public Item[] items;

	public DynamicCapacityStack() {
		this.items = (Item[]) new Object[1];
	}

	public void push(Item item) {
		if (this.n == this.items.length) {
			this.resize(this.items.length * 2);
		}
		this.items[this.n++] = item;
	}

	public Item pop() {
		Item item = this.items[--this.n];
		this.items[this.n] = null;

		if (this.n > 0 && this.n == this.items.length / 4) {
			this.resize(this.items.length / 2);
		}
		return item;
	}

	public boolean isEmpty() {
		return this.n == 0;
	}

	public int size() {
		return this.n;
	}

	private void resize(int max) {
		Item[] target = (Item[]) new Object[max];
		for (int i = 0; i < this.n; i++) {
			target[i] = this.items[i];
		}
		this.items = target;
	}

	public Iterator<Item> iterator() {
		return new DynamicCapacityStackIterator();
	}

	// http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
	private class DynamicCapacityStackIterator implements Iterator<Item> {
		private int i = n;

		public boolean hasNext() {
			return i > 0;
		}

		public Item next() {
			return items[i--];
		}

		public void remove() {
		}
	}
}