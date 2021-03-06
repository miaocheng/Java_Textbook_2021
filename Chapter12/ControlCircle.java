
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ControlCircle  extends JFrame  {
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();
	
    public ControlCircle()  {
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);
        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
        jbtEnlarge.addActionListener(new EnlargeListener());
        jbtShrink.addActionListener(new ShrinkListener());
    }
	
    public static void main(String [] args) {
        JFrame frame = new ControlCircle();
        frame.setTitle("控制圆变大或变小");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}

class EnlargeListener implements ActionListener{
    public void actionPerformed(ActionEvent e)  {
        canvas.enlarge();
    }
}

class ShrinkListener implements ActionListener  {
    public void actionPerformed(ActionEvent e)  {
        canvas.shrink();
    }
}

class CirclePanel extends JPanel    {
    private int radius = 5;
    public void enlarge()
    {
        radius++;
        repaint();
    }

    public void shrink()
    {
        radius--;
        repaint();
    }
	
    protected void paintComponent(Graphics g)   {
        super.paintComponent(g);
        g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
    }

}


