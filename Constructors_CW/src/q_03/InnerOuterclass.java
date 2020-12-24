package q_03;

public class InnerOuterclass 
{
	int outerVariable = 10;

	void outerMethod()
	{
		System.out.println("Hi am from Outer method");
	}
	class InnerClass
	{
		int innerVariable = 10;

		void innerMethod()
		{
			System.out.println("Hi am from inner method");
		}
	}
}
