package control_Statements_HW;

public class Q_12_01 
{
	int percentage;
	public void percentage(int sub1, int sub2, int sub3, int sub4, int sub5) 
	{
		System.out.println("Sum = "+(sub1+sub2+sub3+sub4+sub5));
		percentage = (sub1+sub2+sub3+sub4+sub5)/5;
		
		System.out.println("percentage = "+percentage);
		grade();
	}
	
	void grade()
	{
		if (percentage >= 90) 
		{
			System.out.println("Grade A");
		}
		else if (percentage >= 80) 
		{
			System.out.println("Grade B");
		}
		else if (percentage >= 70) 
		{
			System.out.println("Grade C");
		}
		else if (percentage >= 60) 
		{
			System.out.println("Grade D");
		}
		else if (percentage >= 40) 
		{
			System.out.println("Grade E");
		}
		else if (percentage < 40) 
		{
			System.out.println("Grade F");
		}
		
	}
}
