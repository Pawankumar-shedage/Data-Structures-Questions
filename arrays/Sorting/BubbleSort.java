package arrays.Sorting;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		 int arr[] = {7,8,3,1,2};
		 int n=arr.length;
//		 System.out.println(n);
	        for(int i=0; i<n-1 ; i++)
	        {
//	            System.out.println(i);
	            for(int j=0; j<n-i-1; j++)
	            {
//	                System.out.println("P "+ i + " "+ j);
	                if(arr[j] > arr[j+1])
	                {
	                    
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	                
//	                for(int k=0;k<n;k++)
//	    	        {
//	    	            System.out.print(arr[k]);
//	    	        }
//	    	        System.out.println(" After every iteration on arr.\n");
	                
	            }
//	            System.out.println("--");
	            
	          
	        }
	        
	        System.out.println("Sorted Array");
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i]);
	        }
	        System.out.println();
	        
	}
}
