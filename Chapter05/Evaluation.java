
public class Evaluation	{
	public static double fac(int n)
	{
		double s = n;
		
		if (n <= 1)
			return 1;
			
		for ( ; --n > 0; )
			s *= n;
			
		return s;
	}
	
	public static double sum(int n1, int n2)
	{
		int i;
		double s = 0;
		for (i = n1; i <= n2; i++)
			s = s + 1.0 / fac(i);
			
		return s;
	}
	
	public static void main(String args [])
	{
		double s;
		s = sum(1, 3) + sum(6, 9) + sum(12, 15);
		System.out.printf("\ns = %f", s);
	}

}


