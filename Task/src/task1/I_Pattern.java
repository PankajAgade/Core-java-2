package task1;

public class I_Pattern 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-1},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};//{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length-2; i++) 
		{
			for (int j = 0; j < arr.length-2; j++) 
			{
				int sum = 0;
				sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				
				if(max<sum)
				{
					max = sum;
				}
			}
		}
		
		System.out.println("Max => "+max);
	}
}
