
import java.util.Scanner;

public class GcdAndLcm	{
	public static int gcd(int m, int n)
	{
		int min;
		if (m <= 0 || n <= 0)
			return -1;
			
		if (m > n)
			min = n;
		else
			min = m;
			
		while (min != 0)
		{
			if (m % min == 0 && n % min == 0)
				return min;
				
			min--;
		}	return -1;
	
	}
	
	public static int lcm(int m, int n)
	{
		int max;
		
		if (m <= 0 || n <= 0)
			return -1;
			
		if (m > n)
			max = m;
			
		else
			max = n;
			
		while (max != 0)
		{
			if (max % m == 0 && max % n == 0)
				return max;
				
			max++;		
		}	return -1;
	
	}
	
	public static void main(String args [])
	{
		int m, n;
		System.out.print("请输入两个数，求这两个数的最大公约数和最小公倍数! \n");
		Scanner input = new Scanner(System.in);
		m = input.nextInt();
		n = input.nextInt();
		System.out.printf("%d和%d的最大公约数是%d\n", m, n, gcd(m, n));
		System.out.printf("%d和%d的最小公倍数是%d\n", m, n, lcm(m, n));
		
	}

}


