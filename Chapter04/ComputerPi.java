
public class ComputerPi	{
	public static void main(String args [])	{
		int s;
		float n, t, pi;
		t = 1; 
		pi = 0;
		n = 1.0f;
		s = 1;
		
		while (Math.abs(t) > 1.0e-6)
		{
			pi += t;
			n += 2;
			s = -s;
			t = s / n;
		}
		
		pi = pi * 4;
		System.out.printf("pi = %10.6f\n", pi);
		
	}

}

