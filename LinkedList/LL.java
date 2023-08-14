package LinkedList;

import java.util.LinkedList;

public class LL {
	
	//Linked list from scratch.
	
	
	
	//Node Structure
	
	Node head; 	//creating head.
	
	private int size;
	LL(){
		this.size = 0;
	}
	
	public  class Node
	{
		int data;
		Node next;
				
		Node(int data)
		{
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		//adding to previous nodes
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		
		
		//adding new node at the end
		currNode.next = newNode;
		
	}
	
	
	public void printList()
	{
		if(head == null)
		{
			System.out.println("List is empty."); 
			return;
		}

		Node currNode = head;
		while(currNode!= null)
		{
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
		
	}
	
	//DELETE NODES
	
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("Can't delete list is already empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("Can't delete list is already empty");
			return;
		}
		
		size--;
		
		//corner case 2 when there is only single node
		if(head.next == null)
		{
			head = null;
			return;
		}
		
		Node currNode = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
			currNode= currNode.next;
		}
		
		//reached at second last node
		currNode.next = null;
			
	}
	
	//REVERSING THE LIST
	
	public void reverseList()
	{
		if(head == null || head.next == null)
		{
			return;
		}
		
		//main pointers declared outside the loop
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null)
		{
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update the values;
			prevNode = currNode;
			currNode = nextNode;
				
		}
		
		head.next = null;
		head = prevNode;
	}
	
	
	public int getSize() {
		return size;
	}
	
	
//	to check whether a ll is palindrome or not
	
	public boolean isPalindrome() {
		boolean f = false;
		
//		we have the head
		Node h1 = head;
		
		Node h2 = head;
		
		
		return f;
	}
	
	
	
	//-------------------------------------------------------------
	//Custom LL
	
	public static void main(String[] args) {
		LL list = new LL();
	
		list.addFirst(22);
		list.addFirst(21);
		list.addFirst(20);
		
		
		list.addLast(23);
		list.printList();
		
		list.reverseList();
		list.printList();

//		
//		
//		for(int i=24; i<31; i++)
//		{
//			list.addLast(i);
//		}
//		
//		list.printList();
//		
//		list.deleteFirst();
//		 
//		list.deleteLast();
//		list.deleteFirst();
//		
//	
//		list.printList();
//		
//		System.out.println(list.getSize());
		
		
		//Reverse ll brute force, using extra space O(N).
//		LL l1 = new LL();
//		LL l2 = new LL();
//		
//		l1.addLast(1);
//		l1.addLast(2);
//		l1.addLast(3);
//		l1.addLast(4);
//		
//		l1.printList();
//		
//		for(int i=1; i<=l1.getSize(); i++)
//		{
//			l2.addFirst(i);
//		}
//		
//		l2.printList();
		
		
		//Reversing a LL in O(1).
		
		
//		LL l1 = new LL();
//		l1.addLast(1);
//		l1.addLast(2);
//		l1.addLast(3);
//		l1.addLast(4);
//		
//		l1.printList();
//		
//		l1.reverseList();
//		
//		l1.printList();
		
		
		//Palindrome ll
		

		
	}
}
