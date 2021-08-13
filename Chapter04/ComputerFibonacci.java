
public class ComputerFibonacci	{
	public static void main(String args[])	{
		int i;
		long f1, f2, f3;
		f1 = 1, f2 = 1;
		
		System.out.printf("%10d%10d", f1, f2);
		
		for (i = 3; i < 41; i++)
		{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.printf("%10d", f3);
			
			if (i % 5 == 0)
				System.out.printf("\n");
			
		}
	
	}

}

