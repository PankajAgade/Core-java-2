package q_13_anti_diagolnal;

public class Anti_diagonalsLogic 
{
	int[][] arr = {{1,2,3},
			       {5,4,9},
			       {10,5,0}};


	void antiDiagonal()
	{
		for (int k = 0; k < (arr.length*2)-1; k++) 
		{
			for (int i = 0; i < arr.length; i++)
			{
				for (int j = 0; j < arr.length; j++)
				{
					if (i+j==k) 
					{
						System.out.print(arr[i][j]+" ");
					}
					
				}
			}
			System.out.println();
		}

		System.out.println();
	}


	void display() 
	{
		System.out.println("Array => ");
		for (int[] q : arr) 
		{
			for (int p : q)
			{
				System.out.print(p + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
