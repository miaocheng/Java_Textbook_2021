
import javax.swing.JOptionPane;

public class SentinelValueUsingConfirmationDialog	{
	public static void main(String args [])	{
		int sum = 0;
		int option = JOptionPane.YES_OPTION;
		
		while (option == JOptionPane.YES_OPTION)	{
			String dataString = JOptionPane.showInputDialog("������һ������:");
			sum += Integer.parseInt(dataString);
			option = JOptionPane.showConfirmDialog(null, "�������� ?");
			
			}
			
			JOptionPane.showMessageDialog(null, "��������֮��Ϊ: " + sum);
	
	}

}


