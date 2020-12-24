package Q_01;

public class Employee 
{
	int salary;
	String name;
	
	public Employee(int salary, String name)
	{
		super();
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "[salary=" + salary + ", name=" + name + "]";
	}
	
	
}
