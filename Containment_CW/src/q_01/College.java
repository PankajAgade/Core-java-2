package q_01;
/*
 Create a class college
	i) Data Members: collegeName,Address collegeAddress.
	ii) Constructor with arguments to initialize the variables
	iii) Create method displayCollegeDetails() to display the details of college

 */
public class College 
{
	String collegeName;
	Address collegeAddress;
	
	public College(String collegeName, Address collegeAddress) 
	{
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}
	
	void displayCollegeDetails()
	{
		System.out.println("college Name => "+collegeName);
		System.out.println("college Address => "+collegeAddress);
		System.out.println("");
	}
}
