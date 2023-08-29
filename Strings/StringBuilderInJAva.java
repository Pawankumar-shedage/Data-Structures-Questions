package Strings;

import java.util.Stack;

public class StringBuilderInJAva {
	
	
	
	
	
	public static boolean balBrackets(StringBuilder str)
	{
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++)
		{
						
			if((str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') )
			{
			
				st.push(str.charAt(i));
			}
			else {
				//found closing bracket
				if(st.isEmpty()) return false;
				
				//comparing top of stack and current char of str
				char ci = str.charAt(i);
				char top = st.peek();
				
				
				if(
						(top == '(' && ci == ')') ||
						(top == '{' && ci == '}') ||
						(top == '[' && ci == ']')
					) 
				{
						st.pop();
				}
				else {
					//edge case.
					return false;
				}
				
				
			}
			
		}
		

		
		if(st.isEmpty()) return true;
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
//		StringBuilder sb = new StringBuilder("Pawan");
//		
//		sb.append('k');
//		sb.append('u');
//		sb.append('m');
//		sb.append('a');
//		sb.append('r');
//		
//		System.out.println(sb.charAt(4));
//		
//		sb.insert(1, 'P');
//		sb.setCharAt(0, 'K');
//		System.out.println(sb);
//		
//		sb.delete(7,11);
//		sb.deleteCharAt(6);
//		
//		
//		for(int i =0; i<sb.length(); i++)
//		{
//			System.out.print(sb.charAt(i) + " ");
//		}
//		
//		System.out.println();
		
		
		StringBuilder str = new StringBuilder("");
		
		//test case ([}}])
		
		str.append('(');
//		str.append(')');
		str.append('[');
		str.append('}');
		str.append('}');
		str.append(']');
		str.append(')');
		
		System.out.println( str.capacity());
		
//		System.gc();
		System.out.println(str + " ");
		
		
		
		boolean isStringValid = balBrackets(str);
		
		
		
		
		System.out.println(isStringValid);
		
	}
}
