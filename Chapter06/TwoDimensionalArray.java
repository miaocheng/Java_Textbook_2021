
public class TwoDimensionalArray	{
	public static void main(String [] args)	{
		int a[][] = {{3, 16, 87, 65}, {4, 32, 11, 108}, {10, 25, 12, 27}}, 
		b[] = new int[3],
		i, j, lmax;
		
		for (i = 0; i <= 2; i++)
		{
			lmax = a[i][0];
			
			for (j = 1; j <= 3; j++)
				if (a[i][j] > lmax)
					lmax = a[i][j];
					
			b[i] = lmax;
		}
		
		System.out.printf("\narray a: \n");
		
		for (i = 0; i <= 2; i++)
		{
			for (j = 0; j <= 3; j++)
				System.out.printf("%5d", a[i][j]);
				
			System.out.printf("\n");
		}
		
		System.out.printf("\narray b: \n");
		for (i = 0; i <= 2; i++)
			System.out.printf("%5d", b[i]);
			
		System.out.printf("\n");
	}

}

