package LinkedList;

import java.util.LinkedList;

public class Merge2SortedLinkedList {
	
	public static void mergeLinkedList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		
//		System.out.println(l1.addAll(l2));
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		
		l1.add(1);
		l1.add(3);
		l1.add(4);
		
		l2.add(2); l2.add(5); l2.add(7);
		
		
		System.out.println(l1 + " " + l2);
		mergeLinkedList(l1,l2);
		
		System.out.println(l1);
		
	}
	
	
	
	
	
	
}
