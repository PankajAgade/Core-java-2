package q_01;
/*
b) Create class Person with the following:
	i) Data Members: PName, PAdhaarNo.,PJobName,PJobId,PJobLocation
	ii) Constructor with args to initialize the variables. 
	iii)Create Address object as a member of Person class.
	iv)Create method displayPersonDetails() to display the details of person.
 */
public class Person 
{
	String pName;
	int  pAdhaarNo;
	String pJobName ;
	int pJobId ;
	String pJobLocation ;
	
	Address addobj = new Address(10, "Nagpur", "Maharashtra", "India");
	
	public Person(String pName, int pAdhaarNo, String pJobName, int pJobId, String pJobLocation) 
	{
		this.pName = pName;
		this.pAdhaarNo = pAdhaarNo;
		this.pJobName = pJobName;
		this.pJobId = pJobId;
		this.pJobLocation = pJobLocation;
	}
	
	void displayPersonDetails()
	{
		System.out.println("Person Name => "+pName);
		System.out.println("Person Adhaar no. => "+pAdhaarNo);
		System.out.println("Person Jop Name => "+pJobName);
		System.out.println("Person job Id => "+pJobId);
		System.out.println("Person Job Location => "+pJobLocation);
	}
}
