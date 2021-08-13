
import java.util.Scanner;


public class Test_4		{
	public static void main(String args [])
	{
		int a = 60;
		int b = 13;
		int c = 0;
		
		c = a & b;
		System.out.println("a & b = " + c);
		c = a | b;
		System.out.println("a | b = " + c);
		System.out.println("a^b = " + (a^b));
		System.out.println("~a = " + ~a);
		System.out.println("a << 2 = " + (a << 2));
		System.out.println("a >> 2 = " + (a >> 2));
		System.out.println("a >>> 2 = " + (a >>> 2));
		
	}
}


