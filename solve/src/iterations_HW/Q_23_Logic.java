package iterations_HW;
//sequence are : 0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,… 
public class Q_23_Logic 
{

	public void print() 
	{
		int first = 0;
		int second = 1;
		
		System.out.println("=> "+first);
		System.out.println("=> "+second);
		
		for (int i = 1; i <= 15-2; i++) 
		{
			int sum = second + second + first;

			first = second;
			second = sum;
			
			System.out.println("=> "+sum);
		}
	}
	
}
