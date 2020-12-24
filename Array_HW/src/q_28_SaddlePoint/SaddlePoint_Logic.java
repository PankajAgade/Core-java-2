package q_28_SaddlePoint;

public class SaddlePoint_Logic
{
	int[][] arr = {{6,3,1},
				   {9,7,8},
				   {2,4,5}};
	
	
	void saddlePoint()
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (Smallest(i,j) && greatest(i,j))
				{
					System.out.println("Saddle Point => "+arr[i][j]);
				}
			}
		}
	}


	private boolean greatest(int i, int j)
	{
		boolean great = true;
		
		for (int k = 0; k < arr.length; k++) 
		{
			if (arr[k][j]>arr[i][j]) 
			{
				great = false;
				break;
			}
		}
		
		if (great) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	private boolean Smallest(int i, int j)
	{
		boolean small = true;
		
		for (int k = 0; k < arr.length; k++) 
		{
			if (arr[i][k]<arr[i][j]) 
			{
				small = false;
				break;
			}
		}
		
		if (small) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
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
		
		System.out.println();
	}
}
