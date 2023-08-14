package Questions;

public class level5_Patterns {
	
	public void pattern1(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n-i; j++)
			{
				System.out.print("# ");
		
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}
	
	public void pattern2(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("# ");
				
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
	}
	
	public void pattern3(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n-i-1; j++)
			{
				System.out.print("  ");
				
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("# ");
			}
			
			System.out.println();
		}
		System.out.println("-------------------------");
		
	}
	
	public void pattern4(int n)
	{
		for(int i=n; i>0; i--)
		{
			for(int j = 0; j<n-i; j++)
			{
				System.out.print("  ");
				
			}
			for(int k = 0; k<i; k++)
			{
				System.out.print("# ");
			}
			
			System.out.println();
		}
		System.out.println("-------------------------");
		
	}
	
	
	public void pattern5(int n)
	{
		for(int i=n; i>0; i--)
		{
			for(int j = 0; j<n-i; j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0; k<i; k++)
			{
				System.out.print("# ");
			}
			
			System.out.println();
		}
		System.out.println("-------------------------");
		
	}
	
	public void pattern6(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n-i-1; j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("# ");
			}
			
			System.out.println();
		}
		System.out.println("-------------------------");
		
	}
	
	
	public void minGlass(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int k=0; k<i; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n-i;j++)
			{
				System.out.print("# ");
			}
			
			System.out.println();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
	}
	
	
	
	public static void main(String[] args) {
		
		level5_Patterns q = new level5_Patterns();
		q.pattern1(5);
		q.pattern2(5);
		
		q.pattern3(5);
		
		q.pattern4(5);
		
		q.pattern5(5);
		
		q.pattern6(5);
		
		
		q.minGlass(6);
	}
	
	
	
}
