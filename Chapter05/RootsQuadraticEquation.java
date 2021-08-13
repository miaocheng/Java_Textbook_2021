
import java.util.Scanner;

public class RootsQuadraticEquation		{
	public static void main(String args [])	{
		int a, b, c;
		System.out.print("Input a, b, c:");
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		root(a, b, c);
	}
	
	public static void root(int a, int b, int c)
	{
		float disc, r;
		disc = b * b - 4 * a * c;
		
		if (disc == 0)
		{
			r = root1(a, b, c);
			System.out.printf("x1 = %7.2f\tx2= %7.2f\n", r, r);
		}
		
		else if (disc > 0)
			root2(a, b, c);
		else
			root3(a, b, c);
	}
	
	public static float root1(int a, int b, int c)
	{
		float r;
		r = (-b) / (2.0f * a);
		
		return (r);
	}
	
	public static void root2(int a, int b, int c)
	{
		float disc, x1, x2;
		disc = b * b - 4 * a * c;
		x1 = (float) (-b + Math.sqrt(disc)) / (2.0f * a);
		x2 = (float) (-b + Math.sqrt(disc)) / (2.0f * a);
		
		System.out.printf("x1 = %7.2f\tx2=%7.2f\n", x1, x2);
	}
	
	public static void root3(int a, int b, int c)
	{
		float disc, p, q;
		disc = b * b - 4 * a * c;
		p = -b / (2.0f * a);
		q = (float) Math.sqrt(- disc) / (2.0f * a);
		
		System.out.printf("x1 = %7.2f + %7.2fi\tx2 = %7.2f - %7.2fi\n", p, q, p, q);
	
	}
	
}


