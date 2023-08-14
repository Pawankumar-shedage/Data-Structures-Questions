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
	
	
	
	
	
	
	
	
	
	public void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		level3_Array_Q q = new level3_Array_Q();
		int arr[] = {1,2,81,56,22,85};
		q.sortArrray(arr);
		
		q.printArray(arr);
		
		q.secodLargest(arr);
	}
}
