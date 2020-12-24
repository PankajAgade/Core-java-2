package q_02;

public class T3 extends Thread
{
	@Override
	synchronized public void run() 
	{
//		0 1 1 2 3 5 8 
		
		int first = 0;
		int second = 1;
		int sum = 0;
		
		System.out.println();
		System.out.print(first+" ");
		System.out.print(second+" ");
		
		for (int i = 0; i < 5; i++) 
		{
			sum = first + second ;
			first = second;
			second = sum;
			System.out.print(sum+" ");
		}
		System.out.println();
	}
}
