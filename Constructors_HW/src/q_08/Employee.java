package q_08;
/*
Create a class Employee with int id and String name as member variables. 
Initialize these variables using getter and setter methods by taking data from the user. 
Create object of this class and access these methods from the main method of another class. 
Also provide different values to observe the changes.
 */	
public class Employee 
{
	int id;
	String name;
		
	void setter(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	String getter()
	{
		return name+" "+id;
		
	}
}
