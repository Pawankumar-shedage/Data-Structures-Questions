package arrays.Sorting;

import java.util.Arrays;

public class Test_code {
	
	
	public static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

    public int  partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low -1 );

        for(int j=0; j<= high -1; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }

        i++;
        swap(arr,i,high);
        return i+1;

    }

    public void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pivot_indx = partition(arr,low,high);

            quickSort(arr,low,pivot_indx-1);
            quickSort(arr,pivot_indx+1, high);
        }
    }


    public int[] sortArray(int[] nums,int low, int high) {
    	
      int n = nums.length;
      quickSort(nums,low,high);
      	
      System.out.println(nums[0]);
      
      return nums;


    }
    
    public static void main(String[] args) {
        int nums[] = {21,35,3,52,2};
        int n  = nums.length;
        System.out.println("Hello, World!" + n);

        Test_code a1 = new Test_code();
       a1.sortArray(nums,0,n-1);
        System.out.println(Arrays.toString(a1.sortArray(nums, 0, n-1)));
        
        
        
        
        
    }
}
