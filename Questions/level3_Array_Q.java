package Questions;

public class level3_Array_Q {
	
	//2nd Largest element in array
	
	public  void sortArrray(int arr[])
	{
//		bubble sort
		for(int i=0; i<arr.length - 1; i++)
		{
			for(int j=i+1; j<arr.length ;j++)
			{
				
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}
	
	//✅
	public  void secodLargest(int arr[]) {
		
		sortArrray(arr);
		
		System.out.println("Second largest "+ arr[arr.length - 2]);
	}
	
	public int findDuplicate(int[] arr)
	{
		//brute force approach, T.C O(n^2);
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])	
				{
					return arr[j];
				}
			}
		}
		return -1;
		
	}
	
	
	
	
	
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		level3_Array_Q q = new level3_Array_Q();
		int arr[] = {1,22,81,56,22,85};
		
//		q.sortArrray(arr);
//		q.secodLargest(arr);
		
		int dup = q.findDuplicate(arr);
		System.out.println(dup);
		
		printArray(arr);
		
	}
}


//Questions: Level: 3
//
//(Array programs)
//
//1. program to find duplicate elements in an array.
//2. program to find second largest element in an array of integers.
//3. program to find out the intersection of two arrays. 
//4. program to find out occurrences of each element in an array. 
//5. find the minimum and maximum element of an array. 
//6. program to separate even and odd numbers in an array. 
//7. program to delete specific integer. 
//8. sum of positive and negative elements of an array. 
//9. insert any element at the end/start/middle of the array.
//10. reverse of array. 
//11. sum of elements of an array. 
//12. program tro find the average of an array. 
//

