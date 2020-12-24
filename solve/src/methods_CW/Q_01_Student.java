package methods_CW;

public class Q_01_Student 
{
	int rollNo;
	String name;
	int contactNo;
	int totalMarks;
	
	public void input()
	{
		rollNo = 5;
		name = "pankaj";
		contactNo = 789;
		totalMarks = 100;
	}
	
	public void display()
	{
		System.out.println("Roll no. => "+rollNo);
		System.out.println("Name. => "+name);
		System.out.println("Contact No => "+contactNo);
		System.out.println("Total marks => "+totalMarks);
		
	}
	
	
}
//(rollNo, Name, contactNo, Total marks