package sarasrue;

public class Main 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{0,3,2},{1,7,8},{0,5,2}};
		
		System.out.println("Orignal Array => ");
		for (int[] q : arr) 
		{
			for(int p : q)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		int[][] arr2 = new int[arr.length][arr[0].length+2];
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				arr2[i][j]=arr[i][j];
			}
		}
		
		for (int i = 0; i < arr2.length; i++) 
		{
			int jcount=0;
			for (int j = arr[i].length; j < arr2[i].length; j++) 
			{
				arr2[i][j]=arr[i][jcount++];
			}
		}
		
		System.out.println("new Array => ");
		for (int[] q : arr2) 
		{
			for(int p : q)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for (int k = 1; k <= 5; k++) 
		{
			for (int i = 0; i < arr2.length; i++) 
			{
				for (int j = 0; j < arr2[i].length; j++) 
				{
					if ((i+j)==k) 
					{
						System.out.print(arr2[i][j]+" ");
					}
				}
			}
			System.out.println();
		}
	}
}
