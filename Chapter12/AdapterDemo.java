
import javax.swing.JFrame;
import java.awt.event.*;

public class AdapterDemo extends JFrame {
    public static void main(String [] args) {
        AdapterDemo frame = new AdapterDemo();
        frame.setSize(220, 80);
        frame.setTitle("¼àÌýÆ÷½Ó¿ÚÊÊÅäÆ÷Ê¾Àý ");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public AdapterDemo()    {
        addWindowListener(new WindowAdapter()  {
            public void windowActivated(WindowEvent event)  {
                System.out.println("window activated");
            }
        });

    }
}


