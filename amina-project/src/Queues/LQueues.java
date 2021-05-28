package Queues;

import java.util.Iterator;

public class LQueues<Item> implements Iterable<Item>{
	
	private Node<Item> head;
	private Node<Item> tail;
	public int size;
	
	public LQueues()
	{
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	public int count() {
		return size;
	}
	
	public Item dequeue(){
		
		Item data = head.data;
		head = head.next;
			if (isEmpty()){
				tail = null;
				}
		size--;
		
		return data;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public void enqueue(Item data){
	
	Node oldtail = tail;
	tail = new Node();
	tail.data = data;
	tail.next = null;
	
		if (isEmpty()){
			head = tail;
		}
		
		else{
		oldtail.next = tail;
		}
		size++;
		}
	
	public int size(){
		return size; 
		}
	
	@Override
	public Iterator<Item> iterator() {
		return new LinkedListIterator();
	}

private class LinkedListIterator implements Iterator<Item> {

	Node<Item> current = head;

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public Item next() {

		Item item = current.data;
		current = current.next;
		return item;
		}
	}
}