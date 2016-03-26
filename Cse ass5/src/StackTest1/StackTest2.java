package StackTest1;
import java.util.LinkedList;
import java.util.NoSuchElementException;
/**
 * Class to hold private class Stack. 
 * @author Stewart Johnson sajohn32@asu.edu CSE360 assignment5 pin #414
 */

class  StackTest2
{
/**
 * private class that that creates a stack in the form of a linked list that holds integers
 * @author Owner
 *
 */
private static class Stack
{	
	private static  LinkedList<Integer> stack = new LinkedList<Integer>();//private linked list for my stack
				
/**
 * Method that pushes value to stack.
 * @param value
 */
		
	public static void push(int value)
	{
		Stack.stack.push(value);
	}
	
/**
 * Method that pops value from stack	
 * @return integer that is popped from stack
 */
	public static int pop()
	{
		if ((Stackdata.stack == null) && Stackdata.stack.isEmpty())
			throw new NoSuchElementException("Cannot pop from empty stack");
		else	
			return Stack.stack.pop();
			
	}
	
/**
 * method that peeks at integer on top of stack
 * @return int that is peeked at
 */
	public static int peek()
	{
		if ((Stack.stack == null) && Stack.stack.isEmpty())
			throw new NoSuchElementException("Cannot peek from empty stack");
		else
			return Stack.stack.peek();
		
	}
	/**
	 * counts number of integers in stack
	 * @return number of integers in stack
	 */
	public static int count()
	{
		
		if ((Stack.stack == null) && Stack.stack.isEmpty())
			throw new NoSuchElementException("Cannot count from empty stack");
			return Stack.stack.size();
	
	}
	/**
	 * takes in linked list and returns a string equivalent of linked list
	 * @param stack2 = linked list
	 * @return String of ints in linked list
	 */
	public static String toString(LinkedList<Integer> stack2)
	{
		if ((Stack.stack == null) && Stack.stack.isEmpty())
			throw new NoSuchElementException("Cannot toString from empty stack");
		return Stack.stack.toString();
	}	
	
	
}

/**
 * main that tests functionality of methods on stack
 * @param args
 */
	public static void main(String[] args)
	{	
		
		Stack.push(5);//test push
		Stack.push(6);
		System.out.println(Stack.peek());//test peek
		System.out.println(Stack.pop());//test pop
		System.out.println(Stack.count());//test count
		System.out.println(Stack.toString(Stack.stack));//test tString
		
		
		
		
	}	
		
}
	

