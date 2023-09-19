package arrays;

import java.util.Arrays;

public class medianOfArray {

	static int findMedian(int arr[]) {
		
		//to apply merge sort.
		Arrays.sort(arr);
		
		
		int end = arr.length -1;
		
		int mid = 0 +(end - 0)/2;
		if(arr.length % 2 != 0)
		{
			return mid;
		}
		else {
			mid =  ( arr[mid] + (arr[mid] + 1)) / 2;
			
		}
			
		return arr[mid];   
	}
	
	static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		//1.Sort array	2.find median(mid value of data set)
		
		int arr[] = {1,2,3,66,2,55};
		
		int median = findMedian(arr);
		System.out.println("Median is "+ median);
		printArr(arr);
	}
}
