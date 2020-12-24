package q_07;
/*

 */
public class Employee 
{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.50;
	double hra = 1000.50;
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}
	
	void calculateSalary()
	{
		double salary = basicSalary + ((basicSalary *specialAllowance)/100) + ((basicSalary*hra)/100);
		System.out.println("Basic Salary => "+basicSalary);
		System.out.println("Total Salary => "+salary);
	}
	
	void calculateTransportAllowance()
	{
		double transportAllowance = 0.1*basicSalary;
		System.out.println("transport Allowance => "+transportAllowance);
	}
	
}
