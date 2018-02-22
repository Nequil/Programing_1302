import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHello extends JFrame implements ActionListener {
JLabel question = new JLabel("What is your name");
JLabel greeting = new JLabel("");
Font font = new Font("Arial", Font.BOLD, 16);
JTextField text = new JTextField(15);
JButton button = new JButton("Press when done");

public JHello( ) {
super("Hello Frame");
setLayout(new FlowLayout());
question.setFont(font);
greeting.setFont(font);
add(question);
add(text);
add(button);
add(greeting);
button.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
String name = text.getText();
String greet = "Hello, " + name;
greeting.setText(greet);
}
}
