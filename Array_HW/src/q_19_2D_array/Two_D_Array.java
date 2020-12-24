package q_19_2D_array;

public class Two_D_Array 
{
	int[][] arr = {{1,2,3},
			   {5,4,9},
			   {10,5,0}};
	
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
}
