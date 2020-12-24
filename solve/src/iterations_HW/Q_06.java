package iterations_HW;
//Write a program to find sum of all digits of a number entered by the user.
public class Q_06 
{
	public static void main(String[] args) 
	{
		Q_06_Logic obj = new Q_06_Logic();
		
		int num = obj.input();
		
		obj.sumNumber(num);
	}
}
