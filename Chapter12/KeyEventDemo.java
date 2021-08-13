
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyEventDemo extends JFrame	{
	private JLabel showInf;
	private Container container;
	public KeyEventDemo()	{
		container = this.getContentPane();
		container.setLayout(new BorderLayout());
		showInf = new JLabel();
		container.add(showInf, BorderLayout());
		
		showInf = new JLabel();
		container.add(showInf, BorderLayout.NORTH);
		this.addKeyListener(new keyLis());
		
		this.addWindowListener(new WindowAdapter()	{
			public void windowClosing(WindowEvent e)	{
				System.exit(0);
			}
		});
		
		this.setSize(600, 450);
		this.setVisible(true);
	}

}

class keyLis extends KeyAdapter	{
	public void keyTyped(KeyEvent e)	{
		char c = e.getKeyChar();
		showInf.setText("你按下的键盘键是" + c + "");
	}
	
	public void keyPressed(KeyEvent e)	{
		if (e.getKeyCode() == 27)
			System.exit(0);
	}
	
	public static void main(String [] args)	{
		new KeyEventDemo();
	}
	
}




