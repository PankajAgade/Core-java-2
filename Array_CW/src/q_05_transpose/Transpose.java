package q_05_transpose;

public class Transpose 
{

	public int[][] logic(int[][] arr) 
	{
		int[][] tra = new int[arr.length][arr[0].length];
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length; j++)
			{
				tra[i][j] = arr[j][i];
			}
		}	
		
		return tra;
	}
	
	void print(int[][] arr)
	{
		System.out.println();
		System.out.println("Transpose matrix => ");
		System.out.println();
		
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
