package q_34_largest_and_smallest_word;

public class Largest_and_smallest_word_LOgic
{
	String s = "Hi I am pankaj";

	public void largest_and_smallest_word()
	{
		String[] arr = s.split(" ");
		
		int max = 0;
		int maxi = 0;
		
		int min = Integer.MAX_VALUE;
		int mini = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i].length()>max)
			{
				max = arr[i].length();
				maxi = i;
			}
			
			if (arr[i].length()<min)
			{
				min = arr[i].length();
				mini = i;
			}
		}
		
		System.out.println("max => "+max+" = "+arr[maxi]);
		System.out.println("min => "+min+" = "+arr[mini]);
		
	}
	
	
}
