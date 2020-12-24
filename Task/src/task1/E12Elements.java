package task1;

public class E12Elements 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,6,3,12,1,2,8,9,10,4,11,7}; //5,6,3,   12,1,2,   8,9,10,   4,11,7  // 3 4 5   1 2 8   9 10 12   6 7 11
		
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		int start = 0;
		int endstart = arr.length-3;
		for (int i = 0; i < 2; i++)//(arr.length/3)/2
		{
			
			int s = start;
			int e = endstart;
			int sind = start;
			int eind = endstart;
			for (int l = 0; l < 6; l++)
			{
				int min = Integer.MAX_VALUE;
				int minindex = 0;
				for (int j = s; j < start+3; j++)
				{
					if (min>arr[j])
					{
						min = arr[j];
						minindex=j;
					}
				}
				for (int k = e; k < endstart+3; k++)
				{
					if (min>arr[k])
					{
						min = arr[k];
						minindex=k;
					}
				}
				
				System.out.println("min => "+min);
				
				if (sind<start+3) 
				{
					int temp = arr[sind];
					arr[sind] = arr[minindex];
					arr[minindex] = temp;
					sind++;
					s++;
				}
				else
				{
					int temp = arr[eind];
					arr[eind] = arr[minindex];
					arr[minindex] = temp;
					eind++;
					e++;
				}
					
				
			}
			start = start+3;
			endstart = endstart-3;			
		}
		
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
