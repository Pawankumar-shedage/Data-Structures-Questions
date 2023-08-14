package LinkedList;

import java.util.*;

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
		
		
		String str = "racecar";
//		System.out.println(str.indexOf("c"));
		
		boolean isPalindrome = isPalindrome(str);
//		System.out.println(isPalindrome);
		
		for(int i=1; i<=5; i++)
		{
			ll.add(i);
		}
		
		System.out.println(ll);
		
		LinkedList<Integer> l2 = new LinkedList<>();
		for(int i=ll.size(); i>0; i--)
		{
//			l2.add(i);

		}
		System.out.println(l2);
		
		
		
	}
}
