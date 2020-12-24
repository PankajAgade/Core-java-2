package q_02;
/*
Define a class named Vehicle as described below:
i) Data Members:
	a. vehicle name
	b. vehicle model number
	c. vehicle price
	d. service station name
	
ii) Methods:
	a. Constructor
	b. Display() method to display all the details of class Vehicle.
	
iii) Define another class named Bike that extends the class Vehicle.
	a. Data Members: discountRate
	b. Constructor
	c. Methods:display() to display bike name,bike model number,bike price,service station name,discount rate.
	d. Discount() method to compute the discount.

iv) Create an object for the class Bike and test it.
 */
public class Vehicle
{
	String vName;
	int  vModelNumber;
	int vPrice;
	String vServiceStationName;
	
	public Vehicle(String vName, int vModelNumber, int vPrice, String vServiceStationName) 
	{
		super();
		this.vName = vName;
		this.vModelNumber = vModelNumber;
		this.vPrice = vPrice;
		this.vServiceStationName = vServiceStationName;
	}



	void display()
	{
		System.out.println("vehicle name => "+vName);
		System.out.println("vehicle model number =>"+vModelNumber);
		System.out.println("vehicle price => "+vPrice);
		System.out.println("service station name => "+vServiceStationName);
		
	}
	
}
