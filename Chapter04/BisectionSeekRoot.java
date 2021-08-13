
import java.util.Scanner;


public class BisectionSeeRoot	{
	public static void main(String args [])	{
		float x0, x1, x2, fx0, fx1, fx2;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("Input x1 and x2: ");
			x1 = input.nextFloat();
			x2 = input.nextFloat();
			fx1 = x1 * ( (2 * x1 - 4) * x1 + 3 ) - 6;
			fx2 = x2 * ( (2 * x2 - 4) * x2 + 3 ) - 6;
		}	while(fx1 * fx2 > 0);
		
		do
		{
			x0 = (x1 + x2) / 2;
			fx0 = x0 * ( (2 * x0 - 4) * x0 + 3) - 6;
			
			if ((fx0 * fx1) < 0)
			{
				x2 = x0;
				fx2 = fx0;
			}
			else
			{
				x1 = x0;
				fx1 = fx0;
			}
		}	while (Math.abs(fx0) >= 1e-5);
		
		System.out.printf("The root of the equation is: %6.2f\n", x0);
		
	}
	
}


