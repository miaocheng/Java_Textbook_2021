
import javax.swing.JFrame;
import java.awt.event.*;

public class TestWindowEvent extends JFrame {
    public static void main(String [] args) {
        TestWindowEvent frame = new TestWindowEvent();
        frame.setTitle("TestWindowEvent ");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public TestWindowEvent()    {
        addWindowListener(new WindowListener()  {
            public void windowDeiconified(WindowEvent event)    {
                System.out.println("Window deiconified ");
            }

            public void windowIConified(WindowEvent event)  {
                System.out.println("window iconified");
            }

            public void windowActivated(WindowEvent event)  {
                System.out.println("window activated");
            }

            public void windowDeactivated(WindowEvent event)    {
                System.out.println("window deactivated");
            }

            public void windowOpened(WindowEvent event)    {
                System.out.println("window opened");
            }

            public void windowClosing(WindowEvent event)    {
                System.out.println("window closing");
            }

            public void windowClosed(WindowEvent e)
            {  }

        });
    }
}


