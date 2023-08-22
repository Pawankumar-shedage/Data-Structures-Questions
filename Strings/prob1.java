package Strings;

import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size and elements of array");
		int size = sc.nextInt();
		String arr[] = new String[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.next();
		}
		
//		System.out.println(arr.length);
		
		//to get total length();
		int total_length = 0;
		
		for(int i=0; i<size; i++)
		{
			String a = arr[i];
			for(int j=0; j<a.length(); j++) {
				
//				System.out.println( a.charAt(j) );
				total_length++;
			}
		}
		
		System.out.println("Combined length : "+ total_length);
		
		int i=0;
		while(i<size)
		{
			System.out.println(arr[i]);
			i++;
		}
		
		System.out.println("Arr length : "+ arr.length);
		
	}
}
