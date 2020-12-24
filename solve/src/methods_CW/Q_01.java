package methods_CW;
/*
Write a program to create a class Student and do the following:
 Create a method to input data (rollNo, Name, contactNo, Total marks)
 Create another method to display the data of Student class.
 Create object of Student class and access these methods main method of a new class – StudentDemo.java.
 */
public class Q_01 
{
	public static void main(String[] args) 
	{
		Q_01_Student obj = new Q_01_Student();
		obj.input();
		obj.display();
	}
}
