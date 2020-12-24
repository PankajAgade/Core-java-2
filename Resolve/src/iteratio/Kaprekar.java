package iteratio;

public class Kaprekar 
{
	public static void main(String[] args) 
	{
		int num = 29;
		
		int square = num * num ;
		
		int sq = square;
		
		System.out.println("num => "+num);
		
		System.out.println("Square => "+square);
		
		int sq2 = sq;
		
		int digit = 0;
		while(sq2!=0)
		{
			sq2 = sq2 / 10;
			digit++;
		}
		
		if (digit%2==0)
		{
			digit++;
		}
		
		System.out.println("Digit => "+digit);
		
		int front = frontSum(sq,digit);
		int end   = endSum(sq,digit);
		
		System.out.println("Front Sum => "+front);
		System.out.println("End   Sum => "+end);
		
		
		if ((front+end)==square) 
		{
			System.out.println(num+" is a kaprekar number.");
		}
		else
		{
			System.out.println(num+" is a kaprekar number.");
		}
	}

	private static int endSum(int sq, int digit) 
	{
		int div = (int) Math.pow(10, (digit/2));
		
		return sq%div;
	}

	private static int frontSum(int sq, int digit) 
	{		
		for (int i = 1; i <= digit/2; i++) 
		{
			sq = sq / 10;
		}
		
		return sq;
	}

	
}