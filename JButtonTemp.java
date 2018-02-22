import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonTemp extends JFrame implements ActionListener {

JLabel r1 = new JLabel("Enter two numbers");
JLabel r2 = new JLabel("Press a button");
JLabel r3 = new JLabel("Your result is:");
JButton b1 = new JButton("Add");
JButton b2 = new JButton("Subtract");
JTextField num1 = new JTextField(5);
JTextField num2 = new JTextField(5);
int x, y;

public static void main(String[] args) {
JButtonTemp rFrame = new JButtonTemp( );
rFrame.setSize(300,200);
rFrame.setVisible(true);
rFrame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
}
public JButtonTemp( ) {
super( );
setLayout(new FlowLayout());
add(r1);
add(num1);
add(num2);
add(r2);
add(b1);
add(b2);
add(r3);
b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
Object source = e.getSource();
x = Integer.parseInt(num1.getText());
y = Integer.parseInt(num2.getText());
if(source == b1)
r3.setText("Your result is: " + (x + y));
else if(source == b2)
r3.setText("Your result is: " + (x - y));
}
}
