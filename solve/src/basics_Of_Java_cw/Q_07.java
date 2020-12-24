package basics_Of_Java_cw;
/*
Find the output of following series (Feb Monthly)
int k = 2;
System.out.println(k++ - ++k + k-- - k++ + ++k -k-- + --k + k+ k--- k + --k+ k++);
 */
public class Q_07 
{
	public static void main(String[] args) 
	{
		int k = 2;
		int h = k++ - ++k + k-- - k++ + ++k -k-- + --k + k+ k--- k + --k+ k++;
		System.out.println("K => "+h);
	}
}
