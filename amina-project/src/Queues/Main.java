package Queues;

public class Main {


	public static void main(String a[]){
				 
				
				
 LQueues <String> queue=new LQueues <String>();
				 
		 queue.enqueue("Amina");
		 queue.enqueue("Emina");
		 queue.dequeue();
		 queue.enqueue("Faris");
		 queue.enqueue("Haris");
		 queue.dequeue();
		 queue.enqueue("Merjem");
		 queue.enqueue("Hana");
				 
	for(String i: queue)
			System.out.println(i);
				
		System.out.println("The size of the rows is: "+queue.count());		
		}
	}
