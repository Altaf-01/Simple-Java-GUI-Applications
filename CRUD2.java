import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CRUD2 extends JFrame
{
ArrayList<String> al;
JTextField t1,t2;
JButton b1,b2,b3,b4;
CRUD2()
{
super("CRUD2");
al=new ArrayList<String>();
setSize(700,400);
setLayout(null);

JLabel l1=new JLabel("Input");
l1.setBounds(100,100,200,20);
JTextField t1=new JTextField();
t1.setBounds(300,100,200,20);
JLabel l2=new JLabel("Output");
l2.setBounds(100,130,200,20);
JTextField t2=new JTextField();
t2.setBounds(300,130,200,20);
JButton b1=new JButton("Insert");
b1.setBounds(100,160,100,20);
JButton b2=new JButton("Search");
b2.setBounds(220,160,100,20);
JButton b3=new JButton("Delete");
b3.setBounds(330,160,100,20);
JButton b4=new JButton("Display");
b4.setBounds(440,160,100,20);

add(l1);
add(l2);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);

b1.addActionListener(
new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String a=t1.getText();
al.add(a);
t1.setText("");
t2.setText(String.valueOf(al));
}
}
);

b2.addActionListener(
new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String a=(t1.getText());
if(al.contains(a))
{
    JOptionPane.showMessageDialog(null,"Is Present at "+al.indexOf(a));
}
else
JOptionPane.showMessageDialog(null,"Not Found");

}
}
);


b3.addActionListener(
new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String a=(t1.getText());
if(al.contains(a))
{
al.remove(al.indexOf(a));
}
else
t2.setText("Element not found");

}
}
);


b4.addActionListener(
new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
t2.setText(String.valueOf(al));

}
}
);




}
public static void main(String args[])
{
new CRUD2();
}

}