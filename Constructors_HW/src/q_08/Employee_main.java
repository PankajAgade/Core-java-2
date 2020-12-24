package q_08;

public class Employee_main 
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		obj.setter(123, "Pankaj");
		System.out.println(" => "+obj.getter());
	}
}
