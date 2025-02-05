package task1;

public class Solution3 
{
	public static void main(String[] args) 
	{
		String str1 = "mindstix";
		String str2 = "stix";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		if((str1.length()-str2.length())>=str2.length())
		{
			
			for (int i = 0; i < arr1.length; i++) 
			{
				int index = 0;
				int count = 0;
				if(arr1[i]==arr2[index])
				{
					boolean flag = true;
					for (int j = i; j < arr2.length; j++) 
					{
						if (arr1[j]==arr2[index++] && flag)
						{
							count++;
						}
						else
						{
							flag = false;
						}
					}
					if(count==arr2.length)
					{
						System.out.println("Yes");
					}
				}
			}
		}
		else
		{
			System.out.println("NO");
		}
		
		
		
	}
}
