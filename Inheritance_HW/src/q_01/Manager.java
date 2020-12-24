package q_01;

public class Manager extends Worker
{
	String department = "Manager";
	
	public Manager(String name, int age, int phone, String addres, int salary)
	{
		this.Sname= name;
		this.Sage = age;
		this.SphoneNumber = phone;
		this.Saddress = addres;
		this.Ssalary = salary;
	}
	
	void displayManager()
	{
		System.out.println("department  => "+department);
		System.out.println("Name => "+ Sname);
		System.out.println(" Age =>"+Sage);
		System.out.println("Phone No. => "+SphoneNumber);
		System.out.println("Adddress => "+Saddress);
	}
}
