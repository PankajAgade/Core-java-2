package methods_HW;
/*
Perform the following: Class Name:-Calculator
Method Name:- CalculateSum
Method Description:-Calculates the sum of two Numbers Argument:-int number1, int number Return Type:- int – Sum
Logic:-Calculate the sum of the two numbers number1 and number2 and return the sum.

Method Name:-Calculate Difference
Method Description:-Calculates the difference between two numbers Argument:-int number1 , int number2 Return Type:-int – difference
Logic:-Calculate the difference between the numbers number1 and number2 and return the difference.
 */
public class Q_06 
{
	public static void main(String[] args) 
	{
		Q_06_Calculator obj = new Q_06_Calculator();
		
		int sum = obj.CalculateSum(50, 10);
		int diff = obj.Calculate_Difference(50, 10);
		
		System.out.println("Sum => "+sum);
		System.out.println("Difference => "+diff);		
	}
}
