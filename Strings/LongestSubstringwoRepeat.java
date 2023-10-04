package Strings;

import java.util.HashSet;

public class LongestSubstringwoRepeat {
	
	public static int lengthOfLongestSubstring(String s) {
		int ans = 0;

        HashSet<Character> set = new HashSet<>();
        int left = 0; int right = 0;
        while(right < s.length())
        {
            if(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left++));
            }
            else{
                //add into set
                set.add(s.charAt(right++));
            }

            int currSz = set.size();
            ans = Math.max(ans,currSz);
        }

        return ans;
    }
	
	public static void main(String[] args) {
		
		HashSet<Character> set1 = new HashSet<>();
//		set1.add('a');
//		set1.add('a');
//		set1.add('b');
//		set1.add('c');
		
		String s = "pwwkew";
		int n = s.length() * s.length()/2;
		
		System.out.println(n);
//		String sub[] = new int[(s.length() * s.length()/2)]
		
		
//		All the substrings
		for(int i=1; i<=s.length(); i++)
		{
			//ending point, and then ++ till end.
			for(int j=0; j<=s.length()-i; j++ )
			{
				//printing range -> 
				int k = j + i-1;
				
				for(int p = j; p<=k; p++)
				{
					System.out.print(s.charAt(p));
				}
				System.out.println();
			}
		}
//		System.out.println(s.subSequence(0, s.length() ));
		
		for(int i=0; i<s.length(); i++)
		{
			set1.add(s.charAt(i));
		}
		
		//loop through:
		for(char i : set1) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println(set1.size());
		
		
//		SOlution
		int maxLength = lengthOfLongestSubstring(s);
		System.out.println("longest substring wo repeating chars is of length "+maxLength);
		        

		    
	
	}
}
