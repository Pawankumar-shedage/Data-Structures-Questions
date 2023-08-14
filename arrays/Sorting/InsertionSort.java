package arrays.Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,8,3,1,2};
		int n= arr.length;
		
		for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
		
		
		for(int i=1; i<n; i++ )  //traversing in unsorted array, and assuming fist part to be sorted.
		{
			int current = arr[i];
			int j = i-1;		//element in sorted part.
//			System.out.println(i+" "+j+" "+ current);
			
			while( j>= 0 && current < arr[j])
			{
				arr[j+1] = arr[j];
				j--; //we want to compare unsorted  element(right side) with sorted element(on left side, therefore j--)
			}
			
			//placement of element.
			System.out.println(current);
			arr[j+1] = current;
		}
		
		for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
		
		
		
	}

}
