package q_01;

public class Main 
{
	public static void main(String[] args) 
	{
		Address collgAdd = new Address(10, "nagpur", "MAH", "IN");
		
		Person obj1 = new Person("Pankaj", 999, "S/W Er.", 160, "Pune");
		obj1.displayPersonDetails();
		
		System.out.println();
		
		College obj2 = new College("PIET", collgAdd);
		obj2.displayCollegeDetails();
		
		System.out.println();
		
		Staff obj3 = new Staff("Sagar", collgAdd);
		obj3.displayStaffDetails();
	}
}
