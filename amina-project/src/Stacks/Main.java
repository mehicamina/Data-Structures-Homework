package Stacks;

public class Main {

	public static void main(String[] args) {
		
	LStacks <Integer> stack = new LStacks<Integer>();
	      
        stack.push(5);
        stack.pop();
        stack.push(10);
        stack.pop();
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.pop();
        stack.push(30);
        
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println("Size of the stack is: " + stack.size());
	}
}
