
import java.util.Scanner;

public class TangentSeekRoot	{
	public static void main(String args [])	{
		double x1, a, x2 = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.print("输入初值x1 = ");
		x1 = input.nextDouble();
		
		System.out.print("输入精确值a = ");
		a = input.nextDouble();
		
		x2 = x1 - (x1 - 2 * Math.exp(-x1)) / (1 + x1);
		
		while (Math.abs(x2 - x1) >= a)
		{
			x1 = x2;
			x2 = x1 - (x1 - 2 * Math.exp(- x1)) / (1 + x1);
		}
		
		System.out.printf("方程的近似解 x = %f\n", x2);
	}

}



