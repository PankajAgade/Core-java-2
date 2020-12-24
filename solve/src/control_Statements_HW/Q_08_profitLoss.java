package control_Statements_HW;

import java.util.Scanner;

public class Q_08_profitLoss 
{
	int sellingPrice;
	int costPrice;
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the cost Price : ");
		costPrice = kb.nextInt();
		
		System.out.print("Enter the selling Price : ");
		sellingPrice = kb.nextInt();
	}

	public void checkProfitLoss()
	{
		if (sellingPrice>costPrice)
		{
			System.out.println("There are PROFIT");
		}		
		else if (sellingPrice < costPrice)
		{
			System.out.println("There are LOSS");
		}
	}

}
