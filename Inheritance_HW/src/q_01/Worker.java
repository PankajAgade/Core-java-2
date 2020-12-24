package q_01;
/*
Create a class named ‘Worker’ having the following members: Sname, Sage, Sphone number ,Saddress, Ssalary. 
It also has a method named 'displaySalary' which displays the salary of the members. 
Two classes 'Employee' and 'Manager' inherit the ‘Worker’ class. 
The 'Employee' and 'Manager' classes have data members 'Work specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of 
both of these classes and print the same.
 */
public class Worker 
{
	String Sname;
	int Sage;
	int SphoneNumber;
	String Saddress;
	int Ssalary;
	
	void displaySalary()
	{
		System.out.println("Salary => "+Ssalary);
	}
}
