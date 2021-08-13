
import java.util.Scanner;

public class Rob30Game	{
	public static int human(int t)
	{
		int num;
		
		do {
			System.out.print("Please count(1 or 2) :");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			
			if (num > 2 || num < 1 || t + num > 30)
				System.out.printf("Error input, again !");
			else
				System.out.printf("You count: %d\n", t + num);
		}	while (num > 2 || num < 1 || t + num > 30);
		
		return t + num;	
	}
	
	public static int computer(int t)
	{
		int c;
		System.out.printf("Computer count: ");
		if ( (t + 1) % 3 == 0)
			System.out.printf(" %d\n", ++t);
		else if ( (t + 2) % 3 == 0)
		{
			t += 2;
			System.out.printf(" %d\n", t);
		}
		else
		{
			c = (int) (Math.random() * 2) + 1; 
			t += c;
			System.out.printf(" %d\n", t);
		}
		
		return t;
		
	}
	
	public static void main(String args [])	{
		int ct = 0;
		System.out.printf("\n*****Catch Thirty*****\n*****Game Begin*****\n");
		
		if ((int) (Math.random() * 2) == 1)
			ct = human(ct);
			
		while (ct != 30)
			if ((ct = computer(ct)) == 30)
				System.out.printf("\nComputer wins!\n");
			else if ((ct = human(ct)) == 30)
				System.out.printf("\nHuman wins !\n");
				
			System.out.printf("*****Game Over*****\n");
	}


}


