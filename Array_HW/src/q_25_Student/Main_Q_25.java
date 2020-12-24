package q_25_Student;

public class Main_Q_25 
{
	public static void main(String[] args) 
	{
		Student[] arr = new Student[10];
		
		arr[0] = new Student(0, "P0", 01);
		arr[1] = new Student(1, "P1", 20);
		arr[2] = new Student(2, "P2", 02);
		arr[3] = new Student(3, "P3", 03);
		arr[4] = new Student(4, "P4", 04);
		arr[5] = new Student(5, "P5", 50);
		arr[6] = new Student(6, "P6", 06);
		arr[7] = new Student(7, "P7", 07);
		arr[8] = new Student(8, "P8", 80);
		arr[9] = new Student(9, "P9", 90);
		
		for (Student p : arr) 
		{
			System.out.println(p);
		}
		System.out.println();
		System.out.println();
		
		int max =0;
		for (int i = 0; i < arr.length; i++) 
		{
			max = i;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[max].marks>arr[j].marks)
				{
					max = j;
				}
				Student temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
			}
		}
		
		for (Student p : arr) 
		{
			System.out.println(p);
		}
		System.out.println();
	}
}