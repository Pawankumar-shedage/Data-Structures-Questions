package arrays.Sorting;

public class CountingSort {
	
	public static void countSort(int arr[], int n,int range)
	{
		
		int count[] =  new int[range];
		
		for(int i=0; i<range; i++)
		{
			count[i] = 0;
		}
		
		
		
//		-----------------------------------------------------
		//Updating orig array
		int i=0;
		int j=0;
		while(count[i] != 0 && j<= n)
		{
			arr[j] = i+1;
			j++;
			count[i] -=1;
		}
		i++;
	}
	
	public static void main(String[] args) {
//		
		int arr[] = {2,1,2,3,4,1};
		int n = arr.length;
//		
//		for(int i=0; i<n; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println("\nAfter Sorting.\n");
//		
//		int range = 5;
//		countSort(arr,6,5);
//		
//		//printing array.
//		for(int i=0; i<n; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
		int range =5;
		int count[] =  new int[range+1];
		
		for(int i=0; i<range; i++)
		{
			count[i] = 0;
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i] == arr[j] )
				{
					
					count[i] += 1; 
				}
				
			}
		}
		
		for(int i=0; i<=range; i++) {
			System.out.print(count[i] + " ");
		}
		
	}

}
