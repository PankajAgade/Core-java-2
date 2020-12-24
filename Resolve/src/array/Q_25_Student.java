package array;

public class Q_25_Student 
{
	int rollno;
	String name;
	int marks;
	
	public Q_25_Student(int rollno, String name, int marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}	
	
	@Override
	public String toString() 
	{
		return rollno+" "+name+" "+marks;
	}
}
