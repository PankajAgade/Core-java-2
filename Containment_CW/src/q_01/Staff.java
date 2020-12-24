package q_01;
/*
Create a class Staff
	i) Data Members: employeeName,Address employeeAddress.
	ii) Constructor with arguments to initialize the variables
	iii) Create method displayStaffDetails() to display the details of staff
 */
public class Staff 
{
	String  employeeName;
	Address employeeAddress;
	
	
	public Staff(String employeeName, Address employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}


	void displayStaffDetails()
	{
		System.out.println("employee Name => "+employeeName);
		System.out.println("employee Address => "+employeeAddress);
	}
}
