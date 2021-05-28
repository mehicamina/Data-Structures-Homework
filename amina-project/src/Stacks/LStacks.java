package Stacks;

import java.util.EmptyStackException;

public class LStacks <Item> 
{

	@SuppressWarnings({ "unchecked", "unused" })
	
	private Item[] stackArray = (Item[]) new Object[1];
    private int length=0;
     
    public void push(Item element) {

       if (stackArray.length==length) {
            resize(2*stackArray.length);
            }
       
        stackArray[length] = element;
        length++;
        }

    public Item pop(){
    	
        if (isEmpty()){
            throw new EmptyStackException();
        }
        
        else if (length>0 && length==stackArray.length/4) {
        	resize(stackArray.length/2);
        	}
        return stackArray[--length];
    }

    public boolean isEmpty() {
    	return length==0; 
    }

    public int size() {
        return length;
    }
    
    @SuppressWarnings("unchecked")
    
    public void resize(int capacity) {
    	
        Item[] copy = (Item[]) new Object[capacity];    
        for (int i = 0; i < length; i++)           
            copy[i] = stackArray[i];                            
        stackArray = copy;                                    
    }
}