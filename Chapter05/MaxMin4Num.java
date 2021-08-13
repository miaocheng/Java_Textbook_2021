
import java.util.Scanner;

public class MaxMin4Num		{
	public static int max2num(int x, int y)
	{
	int max;
	max = (x > y) ? x: y;
	
	return (max);
	}
	
	public static int min2num(int x, int y)
	{
		int min;
		min = (x < y) ? x: y;
		
		return min;
	}
	
	public static void main(String args [])	{
		int a, b, c, d, max, min;
		System.out.print("Please input a, b, c, d: ");
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		
		max = max2num(max2num(a, b), max2num(c, d));
		System.out.printf("max = %d\n", max);
		min = min2num(min2num(a, b), min2num(c, d));
		System.out.printf("min = %d\n", min);
	}
	
}


