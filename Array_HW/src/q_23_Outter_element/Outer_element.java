package q_23_Outter_element;

public class Outer_element 
{
	int[][] a = {{1,2,3,5,6},
			{1,2,3,5,6},
			{1,2,3,5,6},
			   {5,4,9,5,9},
			   {1,5,0,8,0}};
	
	void outer()
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (i==0 || j==0 || i==a.length-1 || j==a.length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
