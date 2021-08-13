
import java.util.Arrays;
import java.util.Comparator;


public class SeekAndInsertArray	{
	public static void main(String [] args)
	{
		int i, j, p, q, s, n;
		Integer a[] = new Integer[11];
		a[0] = 127;
		a[1] = 3;
		a[2] = 6;
		a[3] = 28;
		a[4] = 54;
		a[5] = 68;
		a[6] = 87;
		a[7] = 105;
		a[8] = 162;
		a[9] = 18;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		for (i = 0; i < 10; i++)
		{
			p = i;
			q = a[i];
			for (j = i + 1; j < 10; j++)
				if (q < a[j])
				{
					p = j;
					q = a[j];
				}
				
			if (p != i)
			{
				s = a[i];
				a[i] = a[p];
				a[p] = s;
			}
			
			System.out.printf("%d", a[i]);
		}
		
		System.out.print("\ninput number: ");
		n = input.nextInt();
		
		for (i = 0; i < 10; i++)
			if (n > a[i])
			{
				for (s = 9; s >= i; s--)
					a[s+1] = a[s];
					break;	
			}
			
		a[i] = n;
		for (i = 0; i <= 10; i++)
			System.out.printf("%d", a[i]);
		
		System.out.printf("\n");
	}

}


class MyComparator implements Comparator<Integer>	{
	public int compare(Integer o1, Integer o2)	{
		return o2 - o1;		
	}
		
}


