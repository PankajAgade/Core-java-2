package basics_Of_Java_cw;

public class Q_06_01 {

	//Compound Interest = 2000 (1 + 0.08 / 12) (12 * 5) – 2000 = $979.69
	public void calculator_CI(int p, double r, int n, int t) 
	{
		double ci = (p*(Math.pow((1+(r / n)), (n*t))))-p;
		System.out.println("Compound Interest => "+ci);
	}

}
