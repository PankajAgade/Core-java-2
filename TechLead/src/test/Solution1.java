package test;

import java.util.Scanner;

public class Solution1 
{
	public static void main(String[] args) 
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the Size of array : ");
		int size = kb.nextInt();
		
		int[][] arr = new int[size][size];
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print("Enter the element of ["+i+","+j+"] : ");
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println();
		
		int leftToRightDigonal = 0;
		int rightToLeftDigonal = 0;
		for(int i=0 ; i<size ; i++)
		{
			for (int j = 0; j < size; j++) 
			{
				if(i-j==0)
				{
					leftToRightDigonal = leftToRightDigonal + arr[i][j];
				}
				if(i+j==(size-1))
				{
					rightToLeftDigonal = rightToLeftDigonal + arr[i][j];
				}
			}
		}
		
		System.out.println("leftToRightDigonal = "+leftToRightDigonal);
		System.out.println("rightToLeftDigonal = "+rightToLeftDigonal);
		System.out.println();
		
		//int diff = Math.abs(leftToRightDigonal-rightToLeftDigonal);
		
		int diff = leftToRightDigonal-rightToLeftDigonal;
		
		if(diff<0)
		{
			diff= diff * -1;
		}
		
		System.out.println("absolute difference is "+diff);
	}
}
