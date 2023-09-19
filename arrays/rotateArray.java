package arrays;

public class rotateArray {

	//just update array ..return type-> void.
	public static void rotate(int[] nums, int n)
	{
		int temp = nums[0];
		int i;
		for( i=0; i<n -1;i++)
		{
			//swapping left and right elements
			nums[i] = nums[i+1];			//Right rotate (Clock-wise)					
			
		}
		nums[i] = temp;
	}
	
	public static void rightRotate(int[] nums, int r, int n)
	{
		for(int i=0; i<n-r; i++)
		{
			rotate(nums,n);
		}
	}
	
	public static void leftRotate(int[]nums, int l, int n)
	{
		for(int i=0; i<l; i++)
		{
			rotate(nums,n);
		}
	}
	
	public static void printArr(int[] nums)
	{
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//to rotate arr clock-wise
		
		int nums[] = {1,2,3,4};
		
		int n = nums.length;
		printArr(nums);
		
		int r = 1;
		rightRotate(nums,r,n);
		
//		int l = 2;
//		leftRotate(nums,l,n);
		
		printArr(nums);
	}
}
