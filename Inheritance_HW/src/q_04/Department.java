package q_04;
/*
WRITE A PROGRAM for Department class having departmentName and HOD name as instance variables,
a constructor to initialize the variables and showDepartmentDetails() to display the details. 
Create StaffMember class having MemberName and MemberQualification as instance variables. 
Create the constructor and showstaffMemberDetails() method to display the details.
 */
public class Department 
{
	String departmentName;
	String hodNmae;
	
	public Department(String departmentName, String hodNmae)
	{
		super();
		this.departmentName = departmentName;
		this.hodNmae = hodNmae;
	}
	
	void showDepartmentDetails()
	{
		System.out.println("Department Name => "+departmentName);
		System.out.println("HOD Name  => "+hodNmae);
	}
	
	
}
