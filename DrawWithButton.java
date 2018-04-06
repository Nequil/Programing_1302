import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DrawWithButton extends JFrame implements ActionListener {
JButton button = new JButton("Press me");
JButton circle = new JButton("Circle");
Container con = getContentPane();
Color color;
String colorString;
int r;
public static void main(String[] args) {
DrawWithButton frame = new DrawWithButton( );
frame.setSize(400,400);
frame.setLocation(500, 250);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public DrawWithButton() {
con.setLayout(new FlowLayout());
color = Color.RED;
colorString = "red";
con.setBackground(color);
con.add(button);
con.add(circle);
button.addActionListener(this);
circle.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
Object source = e.getSource();
if (source == button) {
if(color.equals(Color.RED)) {
color = Color.BLUE;
colorString = "blue";
}
else {
color = Color.RED;
colorString = "red";
}
con.setBackground(color);
}
else {
r = 100;
}
repaint();
}
public void paint(Graphics g) {
g.setColor(Color.WHITE);
g.setFont(new Font("Serif", Font.ITALIC, 20));
g.drawString("The panel is " + colorString, 20, 100);
g.drawOval(200,150,r,r);
}
}
