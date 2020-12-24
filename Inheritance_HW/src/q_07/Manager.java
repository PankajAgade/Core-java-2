package q_07;

public class Manager extends Employee
{

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) 
	{
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
	}
	
	void calculateTransportAllowance()
	{
		double transportAllowance = 0.15*basicSalary;
		System.out.println("transport Allowance => "+transportAllowance);
	}
	
}
