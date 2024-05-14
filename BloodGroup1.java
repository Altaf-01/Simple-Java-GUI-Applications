import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
public class BloodGroup1 extends JFrame implements ActionListener
{
JCheckBox r1,r2,r3,r4,r5;
JButton b1;
BloodGroup1()
{
super("Blood Group");
setSize(500,300);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
 r1=new JCheckBox("A+");
 r2=new JCheckBox("A");
 r3=new JCheckBox("O+");
 r4=new JCheckBox("B+");
 r5=new JCheckBox("AB+");
 b1=new JButton("Show Selection");
b1.setBounds(100,200,150,20);
r1.setBounds(60,100,60,60);
r2.setBounds(120,100,60,60);
r3.setBounds(180,100,60,60);
r4.setBounds(240,100,60,60);
r5.setBounds(300,100,60,60);
add(b1);
add(r1);
//bg.add(r2);
add(r2);
//bg.add(r3);
add(r3);
//bg.add(r4);
add(r4);
//bg.add(r5);
add(r5);

b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
String result=new String("You have selected : ");
if(r1.isSelected())
{
result=result+r1.getText()+" ";
}
if(r2.isSelected())
{
result=result+r2.getText()+" " ;
}
if(r3.isSelected())
{
result=result+r3.getText()+" ";
}
if(r4.isSelected())
{
result=result+r4.getText()+" ";
}
if(r5.isSelected())
{
result=result+r5.getText()+" ";
}
JOptionPane.showMessageDialog(this,result);
}

public static void main(String args[])
{
new BloodGroup1();
}	

}