package control_Statements_CW;

import java.util.Scanner;

public class Q_04_electricBill
{

	public void input() 
	{
		int units ;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the electric units : ");
		units = kb.nextInt();
		claculateBill(units);
	}

	private void claculateBill(int units) 
	{
		double rate;
		if (units <= 50)
		{
			rate = 50 * 0.50;
		}
		else if (units <= 150)
		{
			rate =( 50 * 0.50) + ((units-50) * 0.75);
		}
		else if (units <= 250)
		{
			rate =(50 * 0.50) + (100 * 0.75) + ((units-150)*1.20);
		}
		else
		{
			rate =(50 * 0.50) + (100 * 0.75) + (150*1.20) + ((units-250)*1.5);
		}
		finalBill(units,rate);
	}

	private void finalBill(int units, double rate) 
	{
		double totalBill = (rate*0.2)+rate;
		System.out.println("Units => "+units);
		System.out.println("Rates => "+rate);
		System.out.println("Total Bill => "+totalBill);
		
	}

}
