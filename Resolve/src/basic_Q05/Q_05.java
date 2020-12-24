package basic_Q05;

public class Q_05 
{
	public static void main(String[] args) 
	{
		int input = 373;
		
		System.out.println("Year => "+input/365);
		input = input%365;
		
		System.out.println("Weak => "+input/7);
		input=input/7;
		
		System.out.println("Days => "+input);
		
	}
}
