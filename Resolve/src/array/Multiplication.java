package array;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		int [][]arr1 = {{1,2,3,4},{4,5,6,2},{2,6,9,4},{2,3,6,5}};
		int [][]arr2 = {{1,2,3,4},{4,5,6,2},{2,6,9,4},{2,3,6,5}};
		
		System.out.println("Array 1 => ");
		for(int[] q : arr1)
		{
			for(int p : q)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("Array 2 => ");
		for(int[] q : arr2)
		{
			for(int p : q)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		int[][] mul = new int[arr1.length][arr2.length];
		if (arr1[0].length==arr2.length) 
		{
			for (int i = 0; i < mul.length; i++) 
			{
				for (int j = 0; j < mul.length; j++) 
				{
					for (int j2 = 0; j2 < mul.length; j2++) 
					{
						int m = arr1[j][j2] * arr2[j2][j];
						mul[i][j] = mul[i][j] + m;
						//mul[i][j] += arr1[j][j2] * arr2[j2][j];
					}
				}
			}
			
			System.out.println("Mul Array => ");
			for(int[] q : mul)
			{
				for(int p : q)
				{
					System.out.print(p+" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		else
		{
			System.out.println("Multiplication Not Allow bcoz first array colummn and second array row are not Same.");
		}
	}
}
