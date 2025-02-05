package task1;

public class Nuton 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int[] p = {2,1,4,3};
		int[] cost = {1,2,3,4};
		
		for(int i=0 ; i<n ;i++) // for ci
		{
			for (int j = 0; j < cost.length; j++)  // for pi
			{
				if ((i>=j && p[i]<=p[j]) || (i<=j && p[i]>=p[j]))
				{
					System.out.println(i+" "+p[j]);
				}
			}
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}
		
		
		
	}
}
