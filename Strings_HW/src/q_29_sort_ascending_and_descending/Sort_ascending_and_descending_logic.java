package q_29_sort_ascending_and_descending;

public class Sort_ascending_and_descending_logic 
{
	String s = "i am pankaj Agade";
	
	void Sort_ascending()
	{
		String[] arr = s.split(" ");
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i].length() > arr[j].length())
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Ascending sort => ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	void Sort_descending()
	{
		String[] arr = s.split(" ");
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i].length() < arr[j].length())
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Descending sort => ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();		
	}
}
