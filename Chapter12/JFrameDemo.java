
import java.awt.*;
import javax.swing.*;

public class JFrameDemo extends JFrame  {
    public JFrameDemo() {
        this.setTitle("JFrame窗口演示");
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        JButton bt = new JButton("按我吧 !");
        panel.add(bt);
        this.add(panel, BorderLayout.SOUTH);
        this.setVisible(true);
        this.setSize(600, 450);
    }

    public static void main(String [] args)
    {
        new JFrameDemo();
    }

}