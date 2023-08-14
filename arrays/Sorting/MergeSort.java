package arrays.Sorting;

public class MergeSort {
	
	//Time complexity of merged sort is fixed, O(n log n). Avg and worst case.
	//Space complexity is O(N) Extra space!.
	
	public static void conquer(int arr[], int si, int mid, int ei)
	{
		
		int merged[] = new int [ei - si +1]; //size of new merged array = length -1 . ( eg length of array containing 6 elements => 5 - 0 +1 = 6);
		
			
		int id1 = si;   //pointer for 1st part
		int id2 = mid+1; //pointer for 2nd part
		int x = 0;  //pointer for merged arr[]  position.
		while(id1 <= mid  && id2 <= ei)
		{
			if(arr[id1] < arr[id2])
			{
				merged[x++] = arr[id1++];
			}
			else
			{
				merged[x++] = arr[id2++];
			}	
		}
		
		while(id1 <= mid)
		{
			merged[x++] = arr[id1++];
		}
		
		while(id2 <= ei)
		{
			merged[x++] = arr[id2++];
		}
		
		
		//Copying into original array  the sorted elements
		for(int i=0, j = si; i<merged.length; i++,j++)
		{
			arr[j] = merged[i];
		}
		
		
	}
	
	public static void divide(int arr[], int si, int ei)
	{
		int mid = si +(ei-si)/2;
		
		if(si >=ei) {
			return;
		}
		
		divide(arr,si,mid);
		
		divide(arr,mid+1, ei);
		
		conquer(arr,si,mid,ei);	//conquer= merge + sort;
		
		
	}
	
	public static void printArray(int arr[],int n)
	{
		System.out.println("Merge Sort: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		
		int arr[] = {3,2,5,1,4,6};
		int n = arr.length;
		 
		divide(arr,0,n-1);
		
		//sorted arr is returned
		// printing the sorted arr
		
		printArray(arr,n);
		
		
	}
}
