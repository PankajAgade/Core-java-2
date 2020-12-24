package iterations_HW;

public class Q_01_print
{

	public void forLoop() 
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public void doWhileLoop()
	{
		int i =1;
		do {
			System.out.print(i+" ");
			i++;
		} while (i<=10);
		System.out.println();
	}

	public void whileLoop() 
	{
		int i=1;
		while (i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
	}
	
}
