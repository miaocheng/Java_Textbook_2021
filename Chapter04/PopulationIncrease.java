
import javax.swing.JOptionPane;


public class PopulationIncrease	{
	public static void main(String args [])	{
		float sum = 13.7f, rate;
		int year = 0;
		
		String dataString = JOptionPane.showInputDialog("��������ƽ��������: ");
		rate = Float.parseFloat(dataString);
		
		do	{
			sum = sum * (1 + rate);
			year++;
		} while (sum < 15);
		
		System.out.printf("year = %d\n", year);
	
	}

}

