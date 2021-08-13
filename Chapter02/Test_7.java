
import java.util.Scanner;


public class Test_7		{
	public static void main(String args [])	{
		int a = 10, b = 20, c = 0;
		c = a + b;
		System.out.println("c = a + b = " + c);
		
		c += a;
		System.out.println("c += a = " + c);
		c -= a;
		System.out.println("c -= a + " + c);
		c *= a;
		System.out.println("c *= a = " + c);
		
		a = 10;	c = 15; c /= a;
		System.out.println("c /= a = " + c);
		a = 10; c = 15;
		c %= a;	System.out.println("c %= a = " + c);
		c <<= 2; System.out.println("c <<= 2 = " + c);
		c >>= 2; System.out.println("c >>= 2 = " + c);
		c >>= 2; System.out.println("c >>= 2 = " + c);
		
		c &= a; System.out.println("c & = 2 = " + c);
		c ^= a; System.out.println("c ^= a = " + c);
		c |= a; System.out.println("c |= a = " + c);
		
	}
}


