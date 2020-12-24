package q_06_maximum_element_matrix;

public class Maximum_element_matrix 
{
	int[][] arr = {{1,2,3},
				   {5,4,9},
				   {10,5,0}};


	void max()
	{
		int max = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (arr[i][j]>arr[j][i])
				{
					max = arr[i][j];
				}
			}
		}
		System.out.println("Max element => "+max);
		System.out.println();
	}
	
	
	void display()
	{
		System.out.println("Array => ");
		for (int[] q : arr) 
		{
			for (int p : q)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
