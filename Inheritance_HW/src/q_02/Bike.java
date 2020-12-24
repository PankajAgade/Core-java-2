package q_02;
/*
 iii) Define another class named Bike that extends the class Vehicle.
	a. Data Members: discountRate
	b. Constructor
	c. Methods:display() to display bike name,bike model number,bike price,service station name,discount rate.
	d. Discount() method to compute the discount.
 */
public class Bike extends Vehicle
{
	int discountRate = 30;
	
	public Bike(String vName, int vModelNumber, int vPrice, String vServiceStationName) 
	{
		super(vName, vModelNumber, vPrice, vServiceStationName);
	}

	void display()
	{
		System.out.println("vehicle name => "+vName);
		System.out.println("vehicle model number =>"+vModelNumber);
		System.out.println("vehicle price => "+vPrice);
		System.out.println("service station name => "+vServiceStationName);
		System.out.println("Discount Rate => "+discountRate);
	}
}
