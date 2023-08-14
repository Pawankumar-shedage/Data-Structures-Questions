package Vector;

import java.util.Vector;

public class vectorDemo1 {
	
	public static void main(String[] args) {
		
		Vector<Integer> vec1 = new Vector<>();
		
		vec1.add(32);
		
		for(int i=1; i<11; i++)
		{
			vec1.add(i);
		}
//		System.out.println(vec1.size());
		
		Vector<String> vec2 = new Vector<>();
		vec2.clone();
		vec2.add(0,"A");
		
		vec1.clear();
		System.out.println(vec1);
	}
}
