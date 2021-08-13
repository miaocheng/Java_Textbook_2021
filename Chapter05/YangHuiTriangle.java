
import java.util.Scanner;

public class YangHuiTriangle	{
	static final int N = 13;
	public static void main(String args [])	{
		int n, i, j, k;
		System.out.printf("输入要打印的行数n (n <= %d): ", N);
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for (i = 0; i < n; i++)
		{
			for (k = 0; k < 42-2*i; k++)
				System.out.printf(" ");
				
			for (j = 0; j <= i; j++)
				System.out.printf("%4d", num(i, j));
		
			System.out.printf("\n");
		}
	
	}
	
	public static int num(int i, int j)
	{
		if (i == j || j == 0)
			return (1);
		else
			return (num(i-1, j-1) + num(i-1, j));
	}

}


