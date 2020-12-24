package iterations_CW;

public class Q_01_FibonacciSeries 
{

	public void print() 
	{
		int first = 0;
		int second = 1;
		int sum;
		System.out.println(first);
		for (int i = 0; i < 10; i++)
		{
			sum = first + second;
			first = second;
			second = sum;
			System.out.println(sum);
		}
	}
	
}
