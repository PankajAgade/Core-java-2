package q_21_addition_matrices;

public class Addition_two_matrices
{
	int[][] a = {{1,2,3},
			   {5,4,9},
			   {10,5,0}};
	
	int[][] b = {{1,2,3},
			   {5,4,9},
			   {10,5,0}};
	
	int[][] add = new int[a.length][a.length];
	
	void adding()
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				add[i][j] = a[i][j] + b[i][j];
			}
		}
		
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
}
