package oop_s_HW;

public class Q_01_input
{
	int year;
	String name;
	int age;
	int salary;
	
	public Q_01_input(int year, String name, int age, int salary)
	{
		super();
		this.year = year;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	void claculateBonus()
	{
		double bonus = 0;
		if (year<5)
		{
			bonus = 0.15 * salary;
		}
		else
		{
			bonus = 0.35 * salary;
		}
		
		printTotalSalary(bonus);
	}


	private void printTotalSalary(double bonus)
	{
		System.out.println("Bonus => "+bonus);
		System.out.println("Total Salary => "+(salary+bonus));
	}
	
	
	
	
}
