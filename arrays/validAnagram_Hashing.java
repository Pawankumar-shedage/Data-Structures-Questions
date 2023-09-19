package arrays;

import java.util.HashMap;
//import java.util.Map;

public class validAnagram_Hashing {
	
	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<>();
		
		//adding elements 
//		hm.put(1, 'c');
//		hm.put(2, 'a');
//		hm.put(3, 'r');
		
		String s = "aacc";
		String w = "ccaa";
		boolean isAnagram = true;
			
		//Adding char of s into hm
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		
//		System.out.println(hm.get('a'));
		//traversing string w and decrementing freq count of chars in hm 
		for(int i=0; i<w.length(); i++)
		{
			char ch = w.charAt(i);
			
			if(!hm.containsKey(ch))
			{
				isAnagram = false;
			
			}
			else if(hm.get(ch) == 1)
			{
				//remover ch
				hm.remove(ch);
			}
			else {
				//dec-- freq count
				hm.put(ch, hm.get(ch) - 1);
			}
				
		}
		
		if(hm.size() == 0)
		{
			isAnagram = true;
		}
		
		System.out.println(isAnagram);
		
	}
}
