package arrays;

import java.util.Scanner;

public class twoDArrays {
	
	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("Insert no. of rows and cols");
		
		int rows = sc.nextInt();
		int cols  =sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		System.out.println("Insert arr[][] elements");
		//input 
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j] = sc.nextInt();
			}
			
		}
		sc.close();
		
		//1 5 7 9 10 11 6 10 12 13 20 21 9 25 29 30 32 41 15 55 59 63 68 70 40 70 79 81 95 105
		
		//print 
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println();
		//spiral print
//		System.out.println(arr.length);
		
		int row_start = 0;
		int row_end =  rows-1;
		int col_start = 0;
		int col_end = cols-1;
		
		System.out.println("Spiral order :");
		
		while(row_start <= row_end && col_start <= col_end)
		{
			//1 right>
			for(int col = col_start; col<=col_end; col++)
			{
				System.out.print(arr[row_start][col] + " ");
			}
			row_start++;
			
			
			//2 down
			for(int row = row_start; row<=row_end; row++)
			{
				System.out.print(arr[row][col_end] + " ");
			}
			col_end--;
			
			//3 left
			for(int k=col_end; k>=col_start; k--)
			{
				System.out.print(arr[row_end][k] + " ");
			}
			row_end--;
			
			//4 Up restart!.
			for(int k=row_end; k>=row_start; k--)
			{
				System.out.print(arr[k][col_start] + " ");
			}
			
			col_start++;
			
		}
		System.out.println();
		
		//transpose;
		
		System.out.println("Transpose of the matrix is :"); //print row vals inside col
		
		for(int i=0; i<cols; i++)
		{
			for(int j=0; j<rows; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
	}
}
