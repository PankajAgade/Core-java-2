package q_27_interleaving_characters_Mindstix;

import java.util.Scanner;

public class Lnterleaving_characters 
{
	static char[] S1={'z','b','x',};//'a','b','c','d','a','k','a','k','h','j'
	static char[] S2={'z','e','f'};//'w','x','y','z'
	static char[] S3= new char[S1.length+S2.length];
	
	
	public static void main(String[] args)
	{
		for (char p : S1) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		for (char p : S2) 
		{
			System.out.print(p+" ");
		}
		System.out.println();	
		
		interleaved(S1, S2, S3, S1.length, S1.length);
		
		for (char p : S3) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
	}
	
	static void interleaved (char[] s1, char[]s2, char[]s3, int s1_len, int s2_len)
	{
		int s1count = 0;
		int s2count = 0;

		System.out.println("len = "+s3.length);
		for (int i = 0; i < s3.length; i++)
		{
			if (s2.length<=s2count && s2count<=s2.length) 
			{
				s3[i]=s1[s1count++];
				continue;
			}
			if (s1.length<=s1count && s1count<=s1.length) 
			{
				s3[i]=s2[s2count++];
				continue;
			}
			if (i%2==0)
			{
				s3[i]=s1[s1count++];

			}
			else
			{
				s3[i]=s2[s2count++];

			}
			
		}
	}
}
