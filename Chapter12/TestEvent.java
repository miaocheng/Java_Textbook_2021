
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestEvent extends JFrame   {
    private JButton button1;
    private Container container;

    public TestEvent()  {
        this.setTitle("��ӭʹ���¼�������ʾ����");
        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        button1 = new JButton("�����¼�");
        button1.addActionListener(new ButtonEventHandle());
        container.add(button1);
        this.setVisible(true);
        this.setSize(300, 400);
    }

}

class ButtonEventHandle implements ActionListener   {
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("���ť�����");
    }

    public static void main(String [] args)
    {
        new TestEvent();
    }

}