package LinkedList;

import java.util.*;

import LinkedList.LL.Node;

public class LLDemo {

	
	public static boolean isPalindrome(String str)
	{
		int i=0; int j=str.length() - 1;
		
		while(i < j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			
			i++;
			j--;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		

		
		LinkedList<Integer> ll = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		l2.add(5);
		l2.add(7);
		l2.add(6);
		
		
		
		System.out.println(ll);
		
		
		
	}
}
