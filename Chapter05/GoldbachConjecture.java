
public class GoldbachConjecture	{
	public static int goldbach_conjecture(int i)
	{
		int j;
		if (i <= 1)
			return 0;
			
		if (i == 2)
			return 1;
			
		for (j = 2; j < i; j++)
		{
			if (i % j == 0)
				return 0;
			else if (i != j + 1)
				continue;
			else
				return 1;
		}
		
		return 1;
	}
	
	public static void main(String args [])	
	{
		int i, j, k, flag1, flag2, n = 0;
		
		for (i = 6; i < 100; i += 2)
			for (k = 2; k <= i / 2; k++)
			{
				j = i - k;
				flag1 = goldbach_conjecture(k);
				
				if (flag1 != 0)
				{
					flag2 = goldbach_conjecture(j);
					
					if (flag2 != 0)
					{
						System.out.printf("%3d=%3d + %3d,", i, k, j);
						n++;
						
						if (n % 5 == 0)
							System.out.printf("\n");
					}
					
				}

			}
		
	}

}

