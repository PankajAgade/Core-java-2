package basics_Of_Java_cw;

public class Q_05_01 
{

	public void convertor(int input)
	{
		System.out.println("Input = "+input);
		System.out.println();
		
		System.out.println("Year = "+input/365);
		input = input % 365;
		
		System.out.println("Week = "+input/7);
		input = input % 7;
		
		System.out.println("Day = "+input);
		
	}
	
}
