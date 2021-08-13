
import java.util.Scanner;

public class ComputerFibonacci	{
	public static void main(String args [])	{
		long s;
		int i = 0;
		
		do
		{
			s = fib(i);
			System.out.printf("Fib(%d) = %d\n", i, s);
			System.out.print("Input Fibonacci Number: ");
			Scanner input = new Scanner(System.in);
			i = input.nextInt();
		}	while(i > 0);
	
	}
	
	public static long fib(int n)
	{
		if (n == 0 || n == 1)
			return n;
		else
			return fib(n - 2) + fib(n - 1);	
	}
	

}

