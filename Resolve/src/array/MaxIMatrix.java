package array;

public class MaxIMatrix 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{71,32,53,10},{15,89,35,04},{23,98,74,69},{65,84,52,35}};
		
		int max = 0;
		for(int[] q : arr)
		{
			for(int p : q)
			{
				if (p>max)
				{
					max = p;
				}
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Maximum element => "+max);
	}
}
