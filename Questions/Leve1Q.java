package Questions;

//import java.util.Scanner;

public class Leve1Q {

//	Q1
	public char[] reverseString(String a)
	{
		char[] ch = a.toCharArray();
		int start = 0; int end = ch.length - 1;
		
		while(start < end)
		{
			char temp = ch[start] ;
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		
		return ch;
	}
	
//	Q2. 
	public void add(int a,int b)
	{
		int sum = a+b;
		System.out.println("Sum "+sum);
	}
	
//	Q3
	public void pattern(int n) {
		
		for(int i = n; i>0; i--)
		{
			for(int j=i; j<=n; j++)
			{
//				System.out.print(i);
//				System.out.print(j);
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	
//	Q4 Leap year
	public boolean isLeapYear(int n)
	{
		boolean  y=false;
		if((n % 4 == 0) && (n % 100!= 0 || (n % 400 == 0) ))
			y = true;
		else
			y = false;
		
		return y;
	}
	
//	Q5
	public void sumOfnums()
	{
		int sum = 0;
		for(int i=1; i<=100; i++)
		{
			if(i % 5 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		 
//		System.out.println("Pop");
		Leve1Q q = new Leve1Q();
		
		System.out.println(q.reverseString("Apple"));
		
		q.add(3,4);
		
		q.pattern(5);
		
		System.out.println(q.isLeapYear(1988));
		
		q.sumOfnums();
		
		
	}
}
