package arrays.Sorting;

public class SelectionSort {
	private static final int MAX_VALUE = 2147483647;

	public static void main(String[] args) {
		
		int arr[] = {7,8,3,1,2};
		
		int n= arr.length;
		for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();

		
		for(int i=0; i<n; i++)
		{
			int smallest = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[smallest] > arr[j])
				{
					smallest = j; //just storing the index of the smallest element in 'smallest' variable.
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		
	   System.out.println("Sorted Array: Selection Sort.");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
     
        
        
		
	}
}
