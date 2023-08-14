package arrays;

import java.util.Arrays;
import java.util.Scanner;



public class SearchingInArrays {
	
	
		public static void printArray(int arr[], int size)
		{	
			for(int i=0; i<size; i++)
			{
				System.out.print(arr[i] +" ");
			}
			System.out.println("\n");
		}
		
		public static void sortArray(int arr[], int size)
		{
			//Sorting manually
			
			int j = 0;
			
			while(j < size )
			{
				for(int i=0; i< size-1; i++ )
				{
					if(arr[i] > arr[i+1])
					{
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
				}
				
				j++;
				
			}
		}
		
		
		public static int  linearSearch(int arr[],int size, int key)
		{
			for(int i=0; i<size; i++)
			{
				if(arr[i] == key)
				{
					return i;
				}
				
			}
			return -1;//if element is not present;
		}
		
		
		public static int  binarySearch(int arr[], int n, int key)
		{
			
			int start = 0; int end = n -1;
			
			while( start <= end) {
				
				int mid = start +(end - start)/2;
				//Checking if element is present at mid.
				if(arr[mid] == key) {
					return mid;
				}
				
				//ignore first half
				if(arr[mid] < key)
				{
					start = mid+1;
				}
				else {
					end = mid -1;
				}
				
			}
			
			//element is not found return -1			
			return -1;
		}
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int arr1[] = {4,21,64,23,14,53};
			
			int size = arr1.length;
			
			System.out.println("Size of Array " + size);
			
			printArray(arr1,size);
			//linear search 
			
			Arrays.sort(arr1);
			
			//printing arrays.
			printArray(arr1,size);
//			-------------------------------------------------------------------------
//			System.out.println("Linear Search :Enter element ");
//			
//			int key = sc.nextInt();
//			
//			int result = linearSearch(arr1,size,key);
//			
//			if(result == -1)
//			{
//				System.out.println("Element is not present in the array.");
//			}
//			else { System.out.println("Element "+ arr1[result]+" is present at "+ result);}
			
			
//			-------------------------------------------------------------------------
			System.out.println("\nBinary Search \n");
			
			//array is divided into 2 parts
			
			int arr2[] = {32,14,3,56,-1,55,23};
			int arr2Size = arr2.length;
			
			printArray(arr2,arr2Size);
			
			//now sorting array.
			sortArray(arr2,arr2Size);
			
			System.out.println("Sorted array");
			printArray(arr2,arr2Size);
			
		
			
			int bsresult = binarySearch(arr2, arr2Size, -1);
//			System.out.println(bsresult);
			
			
			
			if(bsresult == -1) {System.out.println("Element is not present.");}
			else {System.out.println("Element is present at index "+ bsresult);}
			
//			-------------------------------------------------------------------------
			
			
			//Ternary Search(using two mids)
			
			
			
			
		
		
		
	}	
}
