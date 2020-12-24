package iterations_HW;

import java.util.Scanner;

public class Q_08_input
{
	int number;

	Q_08_input ro = new Q_08_input();
	public Q_08_input get()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = kb.nextInt();
		return ro;

	}
	
}
