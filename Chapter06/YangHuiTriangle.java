
public class YangHuiTriangle	{
	public static void main(String [] args)	{
		final int N = 13;
		int i, j, a[][] = new int[N][N];
		
		for (i = 0; i < N; i++)
		{
			a[i][0] = 1;
			a[i][i] = 1;
		}
		
		for (i = 2; i < N; i++)
			for (j = 1; j <= i - 1; j++)
				a[i][j] = a[i-1][j-1] + a[i-1][j];
				
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < 42-2*i; j++)
				System.out.printf(" ");
				
			for (j = 0; j <= i; j++)
				System.out.printf("%4d", a[i][j]);
				
			System.out.printf("\n");
		}
	
	}

}


