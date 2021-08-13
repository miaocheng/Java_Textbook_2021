
import java.util.*;


public class SubtractionQuiz	{
	public static void main(String args [])	{
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		if (number1 < number2)
		{
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.print(number1 + "-" + number2  = "= ? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (number1 - number2 == answer)
		{
			System.out.print("回答正确，很棒!");
		}
		else
			System.out.print("回答不对，请确认:"+number1+"-"+number2+"="+ 
			(number1 - number2) );
		
	}
	
}


