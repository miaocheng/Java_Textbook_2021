
import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {
	public static void main(String [] args)	{
		String annualInterestRateString = JOptionPane.showInputDialog("���������ʣ�Ʃ�磺 5.0");
		String numberOfYearString = JOptionPane.showInputDialog("�������������Ʃ�磺 10");
		String loanAmountString = JOptionPane.showInputDialog("�����ܴ����Ʃ�磺 200000.0");
		
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		double monthlyInterestRate = annualInterestRate / 1200;
		int numberOfYears = Integer.parseInt(numberOfYearsString);
		
		double loanAmount = Double.parseDouble(loanAmountString);
		double monthlyPayment = loanAmount * monthlyInterestRate / ( 1 - 1 /
			Math.pow(1 + monthlyInterestRate, numberOfYears * 12) );
			
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		JOptionPane.showMessageDialog(null, "��֧����Ϊ�� " + (int)
			(monthlyPayment * 100) / 100.0 + "\n��֧����Ϊ�� " + (int) (totalPayment * 100) / 100.0);
		
	}
}

