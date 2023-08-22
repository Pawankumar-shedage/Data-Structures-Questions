package Strings;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = "boba";
		String a = new String ("boba2");
	
////		String sub = s.substring(3); //[ ) [0,n)
////		System.out.println(sub);
//	
//		//compare _
//		if(s.equals(a))
//			System.out.println("Strings are equal");
//		else
//			System.out.println("String are NOT equal");
//		
//		//ternary op
////		variable  = (condition) ? (condition true) : (condition false);
////		String res = (s.equals(a)) ?  "Strings are equal" : "Strings are not equal"; 
////		System.out.println(res);
//		
//		System.out.println(s.substring(0,3));
//		
//		
//		//parsing 
//		String str = "2121";
//		int num = Integer.parseInt(str);
		
		String str2 = "true";
		boolean f = Boolean.parseBoolean(str2);
		
		System.out.println(f +" "+ str2.length());
		
		sc.close();
		
	}
}
