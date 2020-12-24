package q_24_frequency_character;

import java.util.Scanner;

public class Frequency_character_Logic
{
	String s = "asdfgbzcjbcjc";
	
	char c ;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the character : ");
		c = kb.next().charAt(0);
	}
	
	void frequency_character()
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (c==s.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println(c+" => "+count);
	}
}
