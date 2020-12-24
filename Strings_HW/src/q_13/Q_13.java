package q_13;

public class Q_13
{
	public static void main(String[] args) 
	{
		String s = "pankaj";
		char n = 'a';
		int count=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (n==s.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("Count => "+count);
		
		char[] ch = new char[s.length()-count];
		System.out.println("Size => "+ch.length);
		
		count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (n!=s.charAt(i)) 
			{
				ch[count++]=s.charAt(i);
			}
		}
		System.out.println("i Count => "+count);
		
		System.out.print("Array => ");
		for (char c : ch) 
		{
			System.out.print(c);
		}
	}
}
