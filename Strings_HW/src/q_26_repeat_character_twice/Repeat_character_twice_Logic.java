package q_26_repeat_character_twice;

public class Repeat_character_twice_Logic
{
	String s = "abc";
	
	void repeat_character_twice()
	{
		char[] arr = new char[2*s.length()];
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			arr[count++]=s.charAt(i);
			arr[count++]=s.charAt(i);
		}
		
		String s1 = new String(arr);
		
		System.out.println("String 2 => "+s1);
	}
}
