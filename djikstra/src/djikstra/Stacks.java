package djikstra;

import java.util.EmptyStackException;

public class Stacks<Item> {

	@SuppressWarnings({ "unchecked" })
	private Item[] sArray = (Item[]) new Object[1];

	private int length = 0;

	public void push(Item element) {

		if (sArray.length == length) {
			resize(2 * sArray.length);
		}

		sArray[length] = element;
		length++;
	}

	public Item pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		} else if (length > 0 && length == sArray.length / 4) {
			resize(sArray.length / 2);
		}

		return sArray[--length];
	}

	public boolean isEmpty() {

		return length == 0;
	}

	public int size() {
		return length;
	}

	@SuppressWarnings("unchecked")
	public void resize(int capacity) {
		Item[] copy = (Item[]) new Object[capacity];
		for (int i = 0; i < length; i++) {
			copy[i] = sArray[i];
		}

		sArray = copy;
	}
}