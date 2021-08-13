
public class Fibonacci	{
	public static void main(String [] args)	
	{
		int i;
		long f[] = new long[40];
		f[0] = 1l;
		f[1] = 1l;
		
		for (i = 0; i < 40; i++)
		{
			System.out.printf("%10d", f[i]);
			if ((i + 1) % 5 == 0)
				System.out.printf("\n");
		}
	}

}


