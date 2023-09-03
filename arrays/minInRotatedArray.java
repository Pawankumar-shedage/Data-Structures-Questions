package arrays;

public class minInRotatedArray {
	
	public static int findMin(int[] nums) {
			
		int l = 0, r = nums.length -1;
		
		//single element
		if(nums.length == 1)
		{
			return nums[0];
		}
		
//		  if [] is not rotated
		if(nums[0] < nums[r])
		{
			return nums[0];
		}
		
		
		//Binary search
		while(r >= l)
		{
			int mid = l + (r - l) / 2;
			
			if(nums[mid+1] < nums[mid])
			{
				return nums[mid+1];
			}
			
			
			if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
			
			if(nums[mid] > nums[0])
			{
				//min is in right part
				l = mid + 1;
			}else {
				r = mid-1;
			}
		}
		
		
        return Integer.MAX_VALUE;
    }
	

	public static void main(String[] args) {
		
		int nums[] = {2,3,4,5,1};
		 int l = 0; int r = nums.length - 1; 
		int mid = l + (r-l)/2;
		
//		System.out.println(nums[2]);
		
		int min = findMin(nums);
		System.out.println(min);
		
		System.out.println(Integer.MIN_VALUE);
		
		
		
	}
}
