package q_07;
/*
Write a program to demonstrate different types of Inner Classes. 
Create class College as a Outer Class and Department as a Inner Class. 
Use appropriate Variables and Methods.
 */
public class College 
{
	String principle = "Nanoti";
	
	void outerclass()
	{
		System.out.println("~~~~~~~~~~~~~~~~In outer class and out side of inner class~~~~~~~~~~~~~~~~");
		System.out.println("Princlipal => "+principle);
	}
	
	class Department
	{
		String hod = "pallavi";
		
		void innerclass()
		{
			System.out.println("~~~~~~~~~~~~~~~~In inner class ~~~~~~~~~~~~~~~~");
			System.out.println("Princlipal => "+principle);
			System.out.println("HOD   => "+hod);
		}
	}
}
