package iterations_HW;
//Write a program to find if given number is prime or not
public class Q_03 
{
	public static void main(String[] args) 
	{
		Q_03_Logic obj = new Q_03_Logic();
		
		int num = obj.input();
		
		obj.checkPrimeOrNot(num);
	}
}
