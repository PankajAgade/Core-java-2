package q_15;

public class Q_15_logic 
{
	String s = "0123456789012345678901";
	
	void sequence()
	{
		System.out.println();
		System.out.print("Squence = ");
		for (int i = 0; i < s.length(); i=i+5) 
		{
			if (i<s.length())
			{
				System.out.print(s.charAt(i));
			}
			if (i<(s.length()-1)) 
			{
				System.out.print(s.charAt(i+1));
			}
			if (i<(s.length()-2)) 
			{
				System.out.print(s.charAt(i+2));
			}
			System.out.print(" ");
		}
	}
}