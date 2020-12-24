package q_30_StringBuffer_objects;

public class StringBuffer_objects 
{
	StringBuffer[] sbA = new StringBuffer[10];
	
	void sb_objects()
	{
		sbA[0] = new StringBuffer("asfd");
		sbA[1] = new StringBuffer("breyydgrhs");
		sbA[2] = new StringBuffer("cfdSDaA");
		sbA[3] = new StringBuffer("drew");
		sbA[4] = new StringBuffer("esfcs");
		sbA[5] = new StringBuffer("f");
		sbA[6] = new StringBuffer("gasgszjgs");
		sbA[7] = new StringBuffer("hafsds");
		sbA[8] = new StringBuffer("izfddhukjghgfkjhgf");
		sbA[9] = new StringBuffer("jzsdhjjg");	
	}
	
	void Sort_ascending()
	{
		
		for (int i = 0; i < sbA.length; i++) 
		{
			for (int j = i+1; j < sbA.length; j++) 
			{
				if (sbA[i].length() > sbA[j].length())
				{
					StringBuffer temp = sbA[i];
					sbA[i] = sbA[j];
					sbA[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Ascending sort => ");
		for (int i = 0; i < sbA.length; i++) 
		{
			System.out.print(sbA[i]+" ");
		}
		System.out.println();
	}
	
	void Palindrome()
	{
		int count = 0;
		for (int i = 0; i < sbA.length; i++) 
		{
			StringBuffer n = new StringBuffer(sbA[i]);
			n.reverse();
			
			int x = sbA[i].compareTo(n);
		
			if (x==0) 
			{
				count++;
			}
			
		}
		
		System.out.println("Palindrome count => "+count);
	}
}
