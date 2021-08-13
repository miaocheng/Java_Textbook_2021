
import java.util.Scanner;


public class TrapezoidDefiniteIntegral	{
	public static void main(String args [])	{
		int n, i;
		double a, b, x, h, sum;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the integral interval: ");
		n = input.nextInt();
		
		System.out.print("Input the integral interval: ");
		a = input.nextDouble();
		b = input.nextDouble();
		h = (b - a) / n;
		sum = 0.5 * h * (f1(a) + f1(b));
		
		for (i = 1; i <= n-1; i++)
		{
			x = a + i * h;
			sum = sum + h * f1(x);
		}
		
		System.out.printf("The value is: %f\n", sum);
	}
	
	static double f1(double x1)	{
		return (x1 * (x1 * x1 + 2 * x1 - 1));
	}
	
}




