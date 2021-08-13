
import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {
	public static void main(String [] args)	{
		String annualInterestRateString = JOptionPane.showInputDialog("输入年利率，譬如： 5.0");
		String numberOfYearString = JOptionPane.showInputDialog("输入贷款年数，譬如： 10");
		String loanAmountString = JOptionPane.showInputDialog("输入总贷款金额，譬如： 200000.0");
		
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		double monthlyInterestRate = annualInterestRate / 1200;
		int numberOfYears = Integer.parseInt(numberOfYearsString);
		
		double loanAmount = Double.parseDouble(loanAmountString);
		double monthlyPayment = loanAmount * monthlyInterestRate / ( 1 - 1 /
			Math.pow(1 + monthlyInterestRate, numberOfYears * 12) );
			
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		JOptionPane.showMessageDialog(null, "月支付额为： " + (int)
			(monthlyPayment * 100) / 100.0 + "\n总支付额为： " + (int) (totalPayment * 100) / 100.0);
		
	}
}

