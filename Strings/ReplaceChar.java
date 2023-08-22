package Strings;

import java.util.Scanner;

public class ReplaceChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input string");
		String in = sc.next();
		
		String res = "";
		
		for(int i=0; i<in.length(); i++)
		{
			if(in.charAt(i) == 'e')
			{
				res += 'i';
			}
			else {
				res += in.charAt(i);
			}
			
		}
		
		System.out.println("Resultant string : "+ res);
		
		
		
		sc.close();
		
	}
}
