package StackTest1;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * creates class that creates a stack of ints in the form of linked list
 * @author Stewart Johnson sajohn32@asu.edu CSE360 assignment5 pin #414
 *
 */
class Stackdata 
{
	public static LinkedList<Integer> stack = new LinkedList<Integer>();
	
	
		
}

/**
 * creates class of operations to be preformed on the stack instantiated in the 
 * stackdata class
 * @author Owner Stewart Johnson sajohn32@asu.edu CSE360 assignment5 pin #414
 *
 */
class StackOps
{

/*
 * method that pushes int onto the stack
 */
	public static void push(int value)
	{
		Stackdata.stack.push(value);
	}
	
/**
 * method that pops int from the stack	
 */
	public static int pop()
	{
		if ((Stackdata.stack == null) && Stackdata.stack.isEmpty())
			throw new NoSuchElementException("Cannot pop from empty stack");
		else	
			return Stackdata.stack.pop();
			
	}

/**
 * method that peeks at int on top of stack
 */
	public static int peek()
	{
		if ((Stackdata.stack == null) && Stackdata.stack.isEmpty())
			throw new NoSuchElementException("Cannot peek from empty stack");
		else
			return Stackdata.stack.peek();
		
	}

/**
 * method that counts ints in stack
 * @return number of int in stack
 */
	public static int count()
	{
		
		if ((Stackdata.stack == null) && Stackdata.stack.isEmpty())
			throw new NoSuchElementException("Cannot count from empty stack");
			return Stackdata.stack.size();
	
	}
	
/**
* takes in linked list and returns a string equivalent of linked list
* @param stack2 = linked list
* @return String of ints in linked list
*/
	public static String toString(LinkedList<Integer> stack2 )
	{
		if ((Stackdata.stack == null) && Stackdata.stack.isEmpty())
			throw new NoSuchElementException("Cannot toString from empty stack");
		return Stackdata.stack.toString();
	}	

/**
 * Class that tests the the stackops class and the stackdata class to make sure 
 * they are preforming correctly	
 */
	
}

public class StackTest1
{
	public static void main(String[] args)
	{	
		
		StackOps.push(5);//test the push function
		StackOps.push(7);
		System.out.println(StackOps.count());//test count function
		System.out.println(StackOps.pop());//test pop function
		System.out.println(StackOps.peek());//test peek function
		StackOps.push(16);
		StackOps.push(25);
		System.out.println(StackOps.peek());
		System.out.println(StackOps.toString(Stackdata.stack));//test tostring function
		

	}	
		
}
	

