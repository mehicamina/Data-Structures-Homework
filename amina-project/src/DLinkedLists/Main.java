package DLinkedLists;

public class Main {
	
	public static void main(String[] args) {
		
		Dlinkedlists<Integer> list= new Dlinkedlists<Integer>();
		
		list.addToRear(10);
		list.addToRear(20);
		list.addToRear(30);
		list.removeFromFront();
		list.addToRear(40);
		list.removeFromRear();
		
		for(Integer i:list) 
			System.out.println(i);
		System.out.println("The size of list is: " + list.count());
		}
	}
