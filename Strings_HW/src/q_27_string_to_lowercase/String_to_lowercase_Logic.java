package q_27_string_to_lowercase;

public class String_to_lowercase_Logic 
{

	String s = "pANKAJ";
	public void string_to_lowercase() 
	{
		char[] arr = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				arr[i] = (char)(s.charAt(i)+32);
			}
			else
			{
				arr[i] = s.charAt(i);
			}
		}
		
		String s1 = new String(arr);
		
		System.out.println("String new => "+s1);
	}
	
}
