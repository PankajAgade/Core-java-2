package array;

public class Q_25_Main
{
	public static void main(String[] args) 
	{
		Q_25_Student[] arr = new Q_25_Student[10];
		
		arr[0] = new Q_25_Student(01, "Pankaj", 01);
		arr[1] = new Q_25_Student(02, "Pankaj", 51);
		arr[2] = new Q_25_Student(03, "Pankaj", 8651);
		arr[3] = new Q_25_Student(04, "Pankaj", 85);
		arr[4] = new Q_25_Student(05, "Pankaj", 51);
		arr[5] = new Q_25_Student(06, "Pankaj", 21);
		arr[6] = new Q_25_Student(07, "Pankaj", 31);
		arr[7] = new Q_25_Student(88, "Pankaj", 1541);
		arr[8] = new Q_25_Student(98, "Pankaj", 85);
		arr[9] = new Q_25_Student(10, "Pankaj", 5211);
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		int max = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i].marks>max)
			{
				max = arr[i].marks;
				index = i;
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Topper Student => "+arr[index]);
	}
}
