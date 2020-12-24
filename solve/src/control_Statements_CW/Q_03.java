package control_Statements_CW;

/*
Write a program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000: HRA = 20%, DA =80% 
Basic Salary <= 20000 : HRA = 25%, DA=90% 
Basic Salary > 20000 : HRA = 30%, DA =95%
 */
public class Q_03 
{
	public static void main(String[] args) 
	{	
		
		
		Q_03_Salary obj = new Q_03_Salary();
		
		obj.Input();
	}
}
