
import javax.swing.JOptionPane;

public class SentinelValueUsingConfirmationDialog	{
	public static void main(String args [])	{
		int sum = 0;
		int option = JOptionPane.YES_OPTION;
		
		while (option == JOptionPane.YES_OPTION)	{
			String dataString = JOptionPane.showInputDialog("请输入一个整数:");
			sum += Integer.parseInt(dataString);
			option = JOptionPane.showConfirmDialog(null, "继续输入 ?");
			
			}
			
			JOptionPane.showMessageDialog(null, "以上整数之和为: " + sum);
	
	}

}


