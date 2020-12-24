package q_05_transpose;

import java.util.Scanner;

//Write a program to find transpose of a matrix
public class Input 
{
	int[][] input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the row of Matrix A : ");
		int row = kb.nextInt();
		
		System.out.print("Enter the column of Matrix A : ");
		int col = kb.nextInt();
		
		int[][] arr = new int[row][col];
		
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++)
			{
				System.out.print("Enret the element arr["+i+"]["+j+"] : ");
				arr[i][j]=kb.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Input matrix => ");
		System.out.println();
		
		for (int[] q : arr) 
		{
			for (int p : q) 
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		return arr;
	}
}
