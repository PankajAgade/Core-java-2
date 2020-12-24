package q_01;

public class Employee_main 
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee("Pankaj", 160, 100);
		double totalSalary = obj.calculatingsalary();
		obj.employeedata();
		System.out.println("Total salary => "+totalSalary );
	}
}
