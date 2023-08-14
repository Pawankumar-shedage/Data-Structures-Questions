package arrays.Sorting;






public class QuickSort {
	
	
	//Print arr
	public static void printArray(int arr[], int size)
	{
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swap done");
	}
	
	//swap arr elements.
	public static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	
	
	public static int partition(int arr[], int low, int high)
	{
		int i= low -1;
		int pivot = arr[high];	//selecting last element as pivot.
		
		for(int j=low; j<high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				//swap
				swap(arr,i,j);
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
			}
			
		}
		//swapping of pivot, placing pivot at correct position.
		i++;
		swap(arr, i,high);
		
		
		return i;
	}
	
	//quick sort
	public static void quickSort(int arr[], int low , int high)
	{	
		if(low < high)
		{			
			int piv_index  =partition(arr, low,high);
			
			quickSort(arr, low, piv_index-1); //for sorting elements smaller than pivot[]
			quickSort(arr, piv_index+1, high);
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {6,3,9,2,5,8};
		int n = arr.length;
		 System.out.println(n);
		
		quickSort(arr,0,n-1);
		
		printArray(arr,n);
//		-----------------------------------------------------
		
		
		
		swap(arr, 2,5);
		
		printArray(arr,n);
		
		// method overriding. ploymorphism runtime.
		int a =20; int b = 89;
		System.out.println(a+" "+ b);
		swap(a,b);
		
		System.out.println(a+" "+ b);
		
	}
}
