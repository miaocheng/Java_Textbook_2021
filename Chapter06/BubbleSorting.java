

public class BubbleSorting	{
	public static void main(String [] args)	{
		final int N = 30;
		java.util.Scanner input = new java.util.Scanner(System.in);
		int a[] = new int[N], i, j, t;
		System.out.printf("Input %d score: ", N);
		
		for (i = 0; i <= N-1; i++)
			a[i] = input.nextInt();
			
		System.out.printf("\n");
		
		for (j = 0; j <= N-2; j++)
			for (i = 0; i <= N-j-2; i++)
				if (a[i] > a[i+1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
				
		System.out.printf("The sorted score:\n");
		for (i = 0; i <= N-1; i++)
		{
			if (i % 6 == 0)
				System.out.printf("\n");
				
			System.out.printf("%4d", a[i]);
		}
	}
	
}




