package DLinkedLists;


import java.util.Iterator;

public class Dlinkedlists<Item> implements Iterable<Item> {

	Node<Item> head;
	Node<Item> tail;
	int size = 0;

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addToFront(Item item) {

		Node<Item> newNode = new Node<Item>();
		newNode.data=item;
		this.size++;
		
		if(isEmpty()){
			this.head=newNode;
			this.tail=newNode;
		}
		
		else {
			newNode.prev=head;
			head.next=newNode;
			head=newNode; 
		}
	}

	public void addToRear(Item item) {
		
		Node<Item> newNode = new Node<Item>();
		newNode.data = item;
		this.size++;
		
		if (isEmpty()) {
			this.head=newNode;
			this.tail=newNode; 	
			} 
			
		else {
			newNode.prev=tail;
			tail.next=newNode;
			tail=newNode; 
			}
	}

	public int count() {
		return size;
	}
	
	public void removeFromFront() {
		
		if(head==null) {
			throw new IndexOutOfBoundsException("Empty Linked List.");
			}
		
		else {
			head=head.next;
			head.prev=null;
			size--;
		}	
	}
	
	public void removeFromRear() {
		
		if(head==null) {
			throw new IndexOutOfBoundsException("Empty Linked List.");
		}
		
		else if(size==1){
			head=null;
			tail=null;
		}
		
		else {
			Node<Item> current=head;
			
			while(current.next.next!=null) 
				current=current.next;
			
			current.next=null;
		}
		size--;
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
