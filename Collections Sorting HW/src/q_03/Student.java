package q_03;

public class Student 
{
	String name;
	int rollNo;
	int marks;
	
	public Student(String name, int rollNo, int marks) 
	{
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString()
	{
		return "[name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
	
}
