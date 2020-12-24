package q_20_remove_duplicates;

public class Remove_duplicates_Logic 
{

	String s = "pankajaggade";
	
	public void remove_duplicates() 
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if (s.charAt(i) == s.charAt(j))
				{
					count++;
					
					System.out.println(s.charAt(i)+" = "+count);
					break;
				}
			}
		}
		System.out.println("Count => "+count);
		
		char[] arr = new char[s.length()-count];
		
		count = 0 ;
		for (int i = 0; i < s.length(); i++) 
		{
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) 
			{
				if (s.charAt(i)==arr[j])
				{
					flag = true;
					break;
				}
			}
			if (!flag) 
			{
				arr[count++] = s.charAt(i);
			}
		}
		
		
		String s1 = new String(arr);
		
		System.out.println("Removed String => "+s1);
	}
	
}
