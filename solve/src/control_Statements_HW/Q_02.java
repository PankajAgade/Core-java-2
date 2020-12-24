package control_Statements_HW;

public class Q_02 
{
	public static void main(String[] args) 
	{
		
		Q_02_evenOdd obj = new 	Q_02_evenOdd();
		
		obj.input();
		
		boolean flag = obj.checkEvenOdd();
		
		if (flag)
		{
			System.out.println("Given number is Even");
		}
		else
		{
			System.out.println("Given number is Odd");
		}
		
	}
}
