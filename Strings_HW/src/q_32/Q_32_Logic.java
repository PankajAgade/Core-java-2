package q_32;

public class Q_32_Logic 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World";
		String s1 = "Welcome";
		String s2 = "- Let us learn";
		System.out.println("5th index char => "+s.charAt(5));
		
		System.out.println("Compare to => "+s.compareToIgnoreCase(s1));
		
		System.out.println("Concat => "+s+s2);
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)=='a')
			{
				System.out.println("Found 'a' index is => "+i);
				break;
			}
		}
		
		System.out.println("Replace char 'a' to 'e' => "+s.replace('a', 'e'));
		
		System.out.println("Sub String index 4th to 10th => "+s.substring(4, 10));
		
	}
}
