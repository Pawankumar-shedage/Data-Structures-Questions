package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanToInteger {
	
	public static void main(String[] args) {
		
		String s = "MCMXCIV";
//		String s = "LVIII";
//		String s = "CM";
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int op = map.get(s.charAt(s.length() - 1));

		for(int i = s.length() -2; i>=0; i--)
		{
			int curr1 = map.get(s.charAt(i));
			int after = map.get(s.charAt(i + 1));
			
			if( curr1 < after )
			{
				op -= curr1;
			}
			else
			{
				op += curr1;
			}
			
			
		}
		
		System.gc();
		System.out.println("OP :" + op);
		
		
		
		String str = "hello";
//		strings are immutable in java , can't modify the same string
		String rev = "";
		int i=0;
		while(i < str.length())
		{
			char ch = str.charAt(i);
			rev = ch + rev; //we have to add ch before the rev string
			
			i++;
		}
		System.out.println("Reversed string :"+ rev);
		
		
		//Iterating Hashmap
//		for(Map.Entry m :numbers.entrySet())
//		{
//			System.out.print(m.getKey() + " " + m.getValue());
//			System.out.println();
//		}
		
		//we pass key as a index in the get()
	}
}
