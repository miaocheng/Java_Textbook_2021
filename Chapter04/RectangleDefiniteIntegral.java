
import java.util.Scanner;


public class RectangleDefiniteIntegral	{
	public static void main(String args [])	{
		int n, i;
		double a, b, x, h, f, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the Number of interval: ");
		n = input.nextInt();
		
		System.out.print("Input the integral interval: ");
		a = input.nextDouble();
		b = input.nextDouble();
		h = (b - a) / n;
		
		for (i = 0; i < n; i++)
		{
			x = a + i * h;
			f = x * x * x + 2 * x * x - x;
			sum = sum + f * h;
		}
		
		System.out.printf("The value is: %f\n", sum);
	}
	
}


