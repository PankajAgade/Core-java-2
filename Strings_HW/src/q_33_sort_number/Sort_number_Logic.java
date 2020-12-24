package q_33_sort_number;

public class Sort_number_Logic
{
	String s = "43521";
	
	void sort_number()
	{
		int count = 0;
		System.out.println("Legnth => "+s.length());
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>'0' && s.charAt(i)<'9') 
			{
				count++;
			}
		}
		
		System.out.println("Count => "+count);
		
		if (s.length()==count) 
		{
			sort();
		}
		else
		{
			System.out.println("Not all number");
		}
	}

	public void sort() 
	{
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]>arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		String s1 = new String(arr);
		
		System.out.println("String 2 => "+s1);
	}
}
