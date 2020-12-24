package basics_Of_Java_hw;
//Write a program to convert Celsius into Fahrenheit and viceversa.
public class Q_06 
{
	public static void main(String[] args) 
	{
		int celsius = 0 ;
		int fahrenheit = 32;
		
		Q_06_01 obj = new Q_06_01();
		
		obj.celsiusToFahrenheit(celsius);
		obj.fahrenheitToCelsius(fahrenheit);
		
		
	}
}
