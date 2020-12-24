package Q_01;
/*
Create a class Vehicle with member variables: String Color, int wheelCount ,int gearsCount. 
Initialize these variables by giving values. 
Create another constructor which takes 2 arguments(Color and gearsCount), 
calls the default constructor using this () and has a SOP in it displaying the color, 
number of wheels in the Vehicle and number of gears in the vehicle. In main method, 
create an object of type Vehicle by using default constructor. Note the output. 

Create another object of type Vehicle by using the parameterized constructor. 

Note the sequence of data indicating that inner most constructors are called first.
 */
public class Vehicle
{
	String Color = "Red";
	int wheelCount = 4;
	int gearsCount = 6;
	
	Vehicle(String color, int gearsCount)
	{
		this();
		this.Color = color;
		this.gearsCount = gearsCount;
	}
	
	
	Vehicle()
	{
		
		System.out.println("Vehicle color => "+Color);
		System.out.println("Vehicle Wheel count => "+wheelCount);
		System.out.println("Vehicle gearsCount => "+gearsCount);
	}
	
	
}
