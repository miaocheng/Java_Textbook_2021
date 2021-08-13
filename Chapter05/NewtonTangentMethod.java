
import java.util.Scanner;

public class NewtonTangentMethod	{
	public static double fun(double x)
	{
		return x - (x - 2 * Math.exp(-x)) / (1 + x);
	}
	
	public static double result(double x1, double a)
	{
		double x2 = 0.0;
		x2 = fun(x1);
		
		while (Math.abs(x2 - x1) >= a)
		{
			x1 = x2;
			x2 = fun(x1);			
		}
		
		return x2;		
	}
	
	public static void main(String args [])	{
		double x1, a;
		Scanner input = new Scanner(System.in);
		System.out.print("输入初值x1 = ");
		x1 = input.nextDouble();
		System.out.print("输入精确值a = ");
		a = input.nextDouble();
		System.out.printf("方程的近似解x = %f\n", result(x1, a));		
	}
	
}



