package q_01;
/*
Create class Employee with constructors (default and parameterized), 
methods (1 with return type (calculating salary), 1 without return type (displaying employeedata)).
 */
public class Employee 
{
	String name;
	int id;
	int salary;
	
	
	
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	double calculatingsalary()
	{
		double bonus = 0.3*salary;
		double totalSalary = salary + bonus;
		return totalSalary;
	}
	
	void employeedata()
	{
		System.out.println("Name => "+name);
		System.out.println("ID   => "+id);
		System.out.println("salary => "+salary);
	}
	
}
