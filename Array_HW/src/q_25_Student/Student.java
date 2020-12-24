package q_25_Student;

public class Student
{
	int rollno;
	String name;
	int marks;
	
	public Student(int rollno, String name, int marks) 
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
