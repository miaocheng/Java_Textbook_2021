
import java.util.Scanner;

public class SentinelValue	{
	public static void main(String args [])	{
		Scanner input = new Scanner(System.in);
		int sum = 0, data;
		
		do {
			System.out.println("请输入一个整数(0表示输入结束): ");
			int data = input.nextInt();
			sum += data;
		}	while (data != 0)
		
		System.out.println("输入数之和为: " + sum);
	
	}
}


