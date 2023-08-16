package Stack;

import java.util.Stack;

public class Stacks {
	
//	Gate Smasher Video on recursion!!.(for revision).
	public static void pushAtBottom(int data,  Stack<Integer> s)
	{
//		System.out.println("Im here"+ s);
		
		//Base case new data.
		if(s.isEmpty())
		{
			s.push(data);
			
			return;
		}
		// removing top element.
		int top = s.pop();
		
//		System.out.println("Poping remaining "+ top);
		//recursion, till stack is not empty(isEmpty) remove elements.
		
		pushAtBottom(data,s); //when base case is reached the function is executed beyond this point, pushing elements from top to the stack.
		
//		System.out.println("after recur"+ top+" "+ s);
		s.push(top);
		
	}
	
	public static void reverseStack(Stack<Integer> s)
	{
		//base case;
		if(s.isEmpty())
		{
//			System.out.println("Hi");
			return;
		}
		
		int top = s.pop();
		reverseStack(s);
		
		//below code will execute after the base condition is true.
		
		pushAtBottom(top, s);
		
		
	}

	

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		System.out.println(s.search(5)); //1 based position from top of the stack.
		
		//push at bottom of the stack.
//		pushAtBottom(1,s);   
		
		s.push(6);
		
		reverseStack(s);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek() + " ");
			s.pop();
		}
		
		
	}
}

