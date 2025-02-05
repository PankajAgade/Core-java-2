package task1;

public class SarrasRule 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{2,3,1},{1,1,1},{2,2,1}};//{2,3,5},{-1,4,6},{3,-2,7}
		
		System.out.println("Array => ");
		for (int[] is : arr) 
		{
			for(int p:is)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		int[][] arr2 = new int[arr.length][arr[0].length+2];
		
		for (int i = 0; i < arr2.length; i++) 
		{
			int j2 = 0;
			for (int j = 0; j < arr2[i].length; j++) 
			{
				if (j<arr.length)
				{
					arr2[i][j]=arr[i][j];
				}
				else
				{
					arr2[i][j]=arr[i][j2];
					j2++;
				}
			}
		}
		
		System.out.println("Array 2 => ");
		for (int[] is : arr2) 
		{
			for(int p:is)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		int adSum = 0;
		int dSum = 0;
		
		int line = 0;
		for (int k = 2; k <= 4; k++) 
		{
			int adpro = 1;
			int dpro = 1;
			
			for (int i = 0; i < arr2.length; i++) 
			{
				for (int j = 0; j < arr2[i].length; j++) 
				{
					if (i+j==k)
					{
						adpro = adpro * arr2[i][j];
					}
					
					if(j-i==line)
					{
						dpro = dpro * arr2[i][j];
					}
				}
			}
			line++;
			System.out.println();
			System.out.println("AD Product => "+adpro);
			System.out.println("A  Product => "+dpro);
			
			adSum = adSum + adpro;
			dSum = dSum + dpro;
			
		}
		System.out.println("Anti-Digonal => "+adSum);
		System.out.println("Digonal => "+dSum);
		
		int diff = adSum-

		
		if(diff>0)
		{
			System.out.println("Diterminent => "+diff);
		}
		else
		{
			System.out.println("Diterminent => "+(-1*diff));
		}
		
		
		
		
		
		
		
		
		
	}
}
