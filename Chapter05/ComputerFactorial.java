
import java.util.Scanner;

public class ComputerFactorial	{
	public static void main(String [] args)	
	{
		Scanner input = new Scanner(System.in);
		System.out.print("������һ���Ǹ�����: ");
		int n = input.nextInt();
		System.out.print(n + "�Ľ׳�ֵ��: " + factorial(n));
	}
	
	public static long factorial(int n)
	{
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	
	}

}

