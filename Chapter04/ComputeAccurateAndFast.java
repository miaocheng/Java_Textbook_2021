
import java.util.Scanner;


public class ComputeAccurateAndFast	{
	public static void main(String args [])	{
		int num1, num2, answer, result, i, j, k, score = 0;
		long ltstart, ltend;
		float timeuse;
		
		Scanner input = new Scanner(System.in);
		ltstart = System.currentTimeMillis();
		
		for (i = 1; i <= 10; i++)	{
			num1 = (int) (Math.random() * 51);
			num2 = (int) (Math.random() * 51);
			
			result = num1 + num2;
			answer = -1;
			
			for (j = 0, k =1; k <= 3; k++)
			{
				System.out.printf("[%d]->Please input %d + %d = ", i, num1, num2);
				answer = input.nextInt();
				
				if (answer < 0)
					break;
				else if (answer == result)
				{
					System.out.printf("You are a clever boy / girl.\n");
					j = k;
					break;
				}
				else
					System.out.printf("Don't give up.\n");
			}
			
			switch(j)
			{
				case 1: score = score + 10; break;
				case 2: score = score + 7; break;
				case 3: score = score + 5; break;
			}
			
			System.out.printf("Your score is %d.\n", score);
			
			if (answer < 0)
			{
				System.out.printf("You has given up. \n");
				break;
			}
			
		}
		
		ltend = System.currentTimeMillis();
		timeuse = ((float) (ltend - ltstart)) / 1000;
		
		System.out.printf("The total time you used is %d millsecond(%f second). %5.2f·Ö/Ãë.\n", 
					ltend - ltstart, timeuse, score / timeuse);
		
	}
	
}


