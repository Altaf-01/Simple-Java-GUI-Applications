import javax.swing.*;
import java.awt.event.*;
import java.awt.color.*;
import java.util.*;
import java.awt.*;
public class MouseDemo1 extends JFrame implements MouseListener
{
MouseDemo1()
{
super("Mouse Paint");
setSize(700,400);
setVisible(true);
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
addMouseListener(this);
}
public void mouseClicked(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.RED);
g.fillOval(e.getX(),e.getY(),20,20);
}
public void mousePressed(MouseEvent e)
{
Graphics g=drawPanel.getGraphics();
g.setColor(Color.YELLOW);
g.drawLine(e.getX(),e.getY(),e.getX(),e.getY());
}
public void mouseExited(MouseEvent e)
{
JOptionPane.showMessageDialog(null,"Mouse Exited");
}
public void mouseReleased(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.GREEN);
g.fillOval(e.getX(),e.getY(),20,20);
}
public void mouseEntered(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.BLACK);
g.fillOval(e.getX(),e.getY(),20,20);
}
public static void main(String args[])
{
new MouseDemo1();
}
}