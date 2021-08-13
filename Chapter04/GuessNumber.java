
import java.util.*;

public class GuessNumber	{
	public static void main(String [] args)	{
		int number = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("请你猜猜一个0到100间的神奇的数: ");
		
		int guess = -1;
		
		while (guess != number)		{
			System.out.println("\n 请输入你的猜测");
			guess = input.nextInt();
			
			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("你猜得太高了 !");
			else
				System.out.println("你猜得太低了 !");
			
		}
		
	
	}
	
}

