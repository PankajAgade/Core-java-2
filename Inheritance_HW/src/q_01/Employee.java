package q_01;

public class Employee extends Worker
{
	String WorkSpecialization = "Driver";
	
	public Employee(String name, int age, int phone, String addres, int salary)
	{
		this.Sname= name;
		this.Sage = age;
		this.SphoneNumber = phone;
		this.Saddress = addres;
		this.Ssalary = salary;
	}
	
	void displayEmplyee()
	{
		System.out.println("Work Specialization => "+WorkSpecialization);
		System.out.println("Name => "+ Sname);
		System.out.println(" Age =>"+Sage);
		System.out.println("Phone No. => "+SphoneNumber);
		System.out.println("Adddress => "+Saddress);
	}
	
	
}
