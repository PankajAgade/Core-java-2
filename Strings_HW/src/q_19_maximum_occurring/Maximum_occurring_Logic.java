	package q_19_maximum_occurring;

public class Maximum_occurring_Logic
{
	String s = "pankajagadejkkkkmmmmmmmmmmmmmmmmmmmmm";
	
	void maximumOccurring()
	{
		int[] arr = new int[256];
		
		for (int i = 0; i < s.length(); i++) 
		{
			arr[s.charAt(i)]++;
		}
		
		int max=0;
		int maxI = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>1)
			{
				System.out.println(((char)i)+" => "+arr[i]);
			}
			
			if (max<arr[i])
			{
				max = arr[i];
				maxI = i;
			}
		}
		
		System.out.println();
		
		System.out.println("max = "+max);
		System.out.println("Maximum Occurring => "+((char)maxI)+" => "+arr[maxI]);
	}
}
