package Stack;

public class StackImplVLinkedList {
		
//	Node struct for linked list
	
	static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null; //initializing for single node.
		}
	}
	
	static  class Stack{
		
		public static  Node head;
		
		public static boolean isEmpty()
		{
			return head == null;
		}
		
		public static void push(int data)
		{
			Node newNode = new Node(data);
			//adding data
			if(isEmpty())	//if stack is empty.
			{
				head = newNode;
				return;
			}
			
			//if nodes are present.
			newNode.next = head;
			head = newNode;
		}
		
		public static int pop()
		{
			//remove head return head node
			
			//if stack is Empty
			if(isEmpty())
			{
				return -1;
			}
			
			int top = head.data;
			head = head.next;
			
			return  top;
		}
		
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			return head.data;
		}
		
	}
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
	
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		
	}
	
}
