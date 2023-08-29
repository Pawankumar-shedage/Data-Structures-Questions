package arrays;

public class arrBinarySearch {

	public static boolean searchTarget(int arr[],int target)
	{
		int start = 0; int end = arr.length - 1;
		int mid = start + (end-start)/2;
		
		if(target <= mid)
		{
			start = 0; end = mid;
		}else {
			start  =mid;
			
		}
		
		for(int i=0; i<=end;i++)
		{
			if(arr[i] == target)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean searchIn2DArr(int matrix[][], int target)
	{
		 int m = matrix.length; int n=matrix[0].length;

	        if(m==0 || n==0)
	        {
	            return false; //edge case of empty arr.
	        }

	        for(int i=0; i< m; i++)
	        {
	            if(target >= matrix[i][0] || target <= matrix[i][n-1])
	            {
	                //search in row.
	                for(int j=0; j<n; j++)
	                {
	                    if(matrix[i][j] == target)
	                        return true;
	                }
	            }
	        }

	        return false;
    }
	
	
	public static void main(String[] args) 
	{
		
		int arr[] = {21,33,24,43,55};
		
		//arr needs to be sorted First!.
		
		int target = -1;
		boolean exists = searchTarget(arr,target);
		
		System.out.println(exists);
		
		int arr2[][] = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60},
		};
		
		int empArr[][] = {
				{}
		};
		
		System.out.println(empArr.length);
		System.out.println(empArr[0].length);
		
//		Search in 2d array, LeetCOde question solved omo.!!!
		System.out.println(searchIn2DArr(empArr,target));
		
		}
}

