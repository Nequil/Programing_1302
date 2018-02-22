import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JCheckBoxDemo extends JFrame implements ItemListener {
JLabel label = new JLabel("What would you like to drink?");
Font font = new Font("Ariel", Font.BOLD, 16);
JCheckBox coffee = new JCheckBox("Coffee");
JCheckBox cola = new JCheckBox("Cola");
JCheckBox milk = new JCheckBox("Milk");
JCheckBox water = new JCheckBox("Water");
public static void main(String[] args) {
JCheckBoxDemo frame = new JCheckBoxDemo();
frame.setSize(275,200);
frame.setLocation(500,400);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public JCheckBoxDemo() {
super();
setLayout(new FlowLayout());
label.setFont(font);
add(label);
add(coffee);
add(cola);
add(milk);
add(water);
coffee.addItemListener(this);
cola.addItemListener(this);
milk.addItemListener(this);
water.addItemListener(this);
}
public void itemStateChanged(ItemEvent e) {
Object source = e.getSource();
int select = e.getStateChange();
double cost = 0;
if (select == ItemEvent.SELECTED)
if(source == coffee)
cost = 1.00;
}
}
