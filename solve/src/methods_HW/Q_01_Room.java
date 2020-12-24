package methods_HW;

import java.util.Scanner;

public class Q_01_Room 
{
	int length;
	int  width;
	int height;
	

	public Q_01_Room(int length, int width, int height)
	{
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	Scanner kb = new Scanner(System.in);
	
	void whiteWashingArea()
	{
		int area =  (2*width*height)+(2*length*height)+(length*width);
		System.out.println("white Washing Area => "+area);
		whiteWashingCost(area);
	}
	
	void whiteWashingCost(int area)
	{
		int WashingCost = area * 80;
		System.out.println("white Washing Cost => "+WashingCost);
	}
	
	void flooringCost()
	{
		int area = length * width;
		
		System.out.println("1. geometric flooring");
		System.out.println("2. cement flooring");
		System.out.print("Select option : ");
		int key = kb.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("geometric flooring cost => "+(area*200));
			break;

		case 2:
			System.out.println("cement flooring cost => "+(area*100));
			break;


		default:
			break;
		}
	}
	
}
