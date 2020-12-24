 package q_31_sum_of_diagonal_Matrix;

public class Sum_of_diagonal_Matrix 
{
	int[][] arr = {{1,2,3},
			   {5,4,9},
			   {1,5,0}};
	
	int sum = 0;
	
	void display()
	{
		for (int[] q : arr) 
		{
			for (int p : q) 
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}

	public void digonalSum() 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (i+j==(arr.length-1))
				{
					System.out.print(arr[i][j]+" ");
					sum = sum + arr[i][j];
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Sum => "+sum);
	}
	
	
}
