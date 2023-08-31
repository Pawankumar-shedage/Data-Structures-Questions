package Queues;
//import java.util.Queue;
import java.util.*;

public class QueueCF {
	
	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<>(); 
		Queue<Integer> q = new ArrayDeque<>(); // Double ended queue, usuall pref, just cache based diff is present between LinkedList and ArrayDeque Implementation.
		
		//Queue is an interface , and it is implemented by ArrayDeque and LinkedList.
//		and objects are made of classes not interfaces.
		
		q.add(32);
		q.add(23);
		q.add(53);
		
		int head = q.poll();
		System.out.println(head);
		
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}

}
