
import java.util.Scanner;
import java.lang.Math;

public class ComputeLoan	{
	public static void main(String [] args)	{
		Scanner input = new Scanner(System.in);
		System.out.print(": 5.0");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		
		System.out.print("?入年利率，譬如: 10");
		int numberOfYears = input.nextInt();
		System.out.print("?入?款金?，譬如: 2000000.0");
		
		double loanAmount = input.nextDouble();
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 /
			Math.pow(1 + monthlyInterestRate, numberOfYears * 12) );
			
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.print("月支付??: " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("?支付??: " + (int) (totalPayment * 100) / 100.0);
		
	}
}


