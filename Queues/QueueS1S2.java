package Queues;

import java.util.Stack;

public class QueueS1S2 {

	//implementing Queue using 2 Stacks
	
	static class Queue{
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();
		
		
		public static boolean isEmpty()
		{
			return s1.isEmpty();
		}
		
		
		public static void add(int data)
		{
			//1.push all elements of s1 into s2
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			
			//2. add new element to s1
			s1.push(data);
			
			//3.again add all elements from s2 to s1 back.
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
			
		}
		
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			
			//front of queue;
			
			return s1.pop();
		}
		
		public static int  peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			
			return s1.peek();
					
		}
	}
	
	
//	----------------------------------
	public static void main(String[] args) {
		
		Queue q1 = new Queue();
		q1.add(3);
		q1.add(2);
		q1.add(1);
		
		while(!q1.isEmpty())
		{
			System.out.println(q1.peek());
			q1.remove();
		}
		
	}
}
