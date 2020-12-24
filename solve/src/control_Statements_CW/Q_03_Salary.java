package control_Statements_CW;

import java.util.Scanner;
/*

Basic Salary <= 10000: HRA = 20%, DA =80% 
Basic Salary <= 20000 : HRA = 25%, DA=90% 
Basic Salary > 20000 : HRA = 30%, DA =95%
 */
public class Q_03_Salary 
{

	public void Input()
	{
		int basicSalary ;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the basic salary : ");
		basicSalary = kb.nextInt();
		claculateSalary(basicSalary);
	}
	
	public void claculateSalary(int basicSalary) 
	{
		int hra = 0 ;
		int da = 0;
		if (basicSalary  <= 10000) 
		{
			hra = (20 * basicSalary)/100;
			da = (80 * basicSalary)/100;
		}
		if (basicSalary  <= 20000)
		{
			hra = (25 * basicSalary)/100;
			da = (90 * basicSalary)/100;
		}
		if (basicSalary  > 20000) 
		{
			hra = (30 * basicSalary)/100;
			da = (95 * basicSalary)/100;
		}
		
		int grossSalary = hra + da + basicSalary;
		
		display(grossSalary,basicSalary);
	}

	private void display(int grossSalary, int basicSalary)
	{
		System.out.println("Basic Salary is => "+basicSalary);
		System.out.println("Total Salary is => "+grossSalary);
		
	}
}
