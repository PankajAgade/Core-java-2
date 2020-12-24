package access_Modifiers;

public class EmployeeDemo 
{
	protected int emp_id = 52;
	public String emp_name = "Pankaj";
	private int emp_salary = 15;
	String emp_dept = "IT";
	
//	PUBlic void doPUBlic(),defaUlt void doDefaULt(),protected void doProtected(),private void doPrivate().
	
	public void doPublic()
	{
		System.out.println(emp_id+" "+emp_name+" "+" "+emp_salary+" "+emp_dept);
		
	}
	
	void doDefault()
	{
		System.out.println(emp_id+" "+emp_name+" "+" "+emp_salary+" "+emp_dept);
		
	}
	
	protected void 	doProtected()
	{
		System.out.println(emp_id+" "+emp_name+" "+" "+emp_salary+" "+emp_dept);
		
	}
	
	private void doPrivate()
	{
		System.out.println(emp_id+" "+emp_name+" "+" "+emp_salary+" "+emp_dept);
	}
}
