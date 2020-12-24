package basics_Of_Java_hw;

public class Q_06_01 {

	public void celsiusToFahrenheit(int celsius)
	{
		double result = (celsius * 9/5)+32;
		System.out.println("Celsius("+celsius+") To Fahrenheit = "+result);
	}

	public void fahrenheitToCelsius(int fahrenheit) 
	{
		double result = (fahrenheit - 32)+(5/9);
		System.out.println("Fahrenheit("+fahrenheit+") To Celsius = "+result);
	}

}
