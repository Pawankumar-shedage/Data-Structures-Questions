package Stack;

import java.util.Stack;

public class Stacks {
	
//	Gate Smasher Video on recursion!!.(for revision).
	public static void pushAtBottom(int data,  Stack<Integer> s)
	{
		System.out.println("Im here"+ s);
		
		//Base case new data.
		if(s.isEmpty())
		{
			s.push(data);
			System.out.println(data);
			return;
		}
		// removing top element.
		int top = s.pop();
		
		System.out.println("Poping remaining "+ top);
		//recursion, till stack is not empty(isEmpty) remove elements.
		
		pushAtBottom(data,s); //when base case is reached the function is executed beyond this point, pushing elements from top to the stack.
		
//		System.out.println("after recur"+ top+" "+ s);
		s.push(top);
		
//		System.out.println(s);
		
		
		
	}

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		System.out.println(s.search(5)); //1 based position from top of the stack.
		
		//push at bottom of the stack.
		pushAtBottom(1,s);   
		
		
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		
	}
}

