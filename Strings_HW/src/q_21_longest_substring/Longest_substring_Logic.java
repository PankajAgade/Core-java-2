package q_21_longest_substring;

public class Longest_substring_Logic 
{
	String s = "Hi am Pankaj";
	
	void longest_substring()
	{
		String[] arr = s.split(" ");
		
		int maxl = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (uniqueLength(arr[i])>maxl)
			{
				maxl = uniqueLength(arr[i]);
				System.out.println();
			}
		}
		

		System.out.println();
		System.out.println("Max lenght => "+maxl);
	}

	public int uniqueLength(String as) 
	{
		int l=0;
		
		for (int i = 0; i < as.length(); i++) 
		{
			for(int j = i+1 ; j < as.length(); j++) 
			{
				if (as.charAt(i) == as.charAt(j))
				{
//					System.out.println(as.charAt(i)+" != "+as.charAt(j));
					l++;
					break;
				}
			}
		}
		
		return as.length()-l;
	}
	
}
