
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestEvent2 extends JFrame implements ActionListener    {
    private JButton button1;
    private Container container;

    public TestEvent2() {
        this.setTitle("欢迎使用事件处理演示程序");
        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        button1 = new JButton("退出");
        button1.addActionListener(this);
        container.add(button1);
        this.show(true);
        this.setSize(300, 400);
    }

    public void actionPerformed(ActionEvent e)  {
        System.exit(0);
    }

    public static void main(String [] args) {
        new TestEvent2();
    }

}

