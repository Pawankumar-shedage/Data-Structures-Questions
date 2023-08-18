package Questions;

public class level2Q {

	public void numOfOccurrence(String str)
	{
		str.toLowerCase();
		
	}
	public static void main(String[] args) {
		
		level2Q s = new level2Q();
		
		String str = "Excel@123";
		String low = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.print(low.charAt(i) + " ");
		}
//		s.numOfOccurrence(str);
		
	}
}


//Questions: Level:2 (Any 5)
//
//1. find the number of occurrence of a character in a given string.( Excel@123 )
//
//2. find the number of vowels and constraints in a string. 
//
//3. take an array give some elements into it and find the reverse of an array. 
//
//4. check the given number is prime or not. 
//
//5. check the fgiven String is palindrome or not. (saas -> saas)
//
//6. write a program to iterate the list using the lambra expressions. 
//
//7. Swap the numbers without using third variable. 

