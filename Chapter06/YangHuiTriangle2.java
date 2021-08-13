
public class YangHuiTriangle2	{
	public static void main(String [] args)
	{
		final int N = 13;
		int i, j, a[] = new int[N];
		a[0] = 1;
		a[1] = 1;
		
		System.out.printf("%46d\n", a[0]);
		
		for (i = 1; i < N; i++)
		{
			for (j = 0; j < 42-2*i; j++)
				System.out.printf("");
				
			for (j = 0; j <= i; j++)
				System.out.printf("%4d", a[j]);
				
			System.out.printf("\n");
			if (i < 12)
			{
				a[i + 1] = 1;
				for (j = i; j >= i; j--)
					a[j] = a[j-1] + a[j];
			}
		
		}	
	
	}

}